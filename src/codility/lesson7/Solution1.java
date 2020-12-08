package codility.lesson7;

import java.util.Stack;

public class Solution1 {
	public int solution(String S) {// %37
		// write your code in Java SE 8
		int result = 0;

		if (S != null) {
			if ("".equals(S))
				result = 1;
			else {
				char stringChar, stackChar;
				Stack<Character> cStack = new Stack<Character>();
				char[] charArr = S.toCharArray();
				boolean control = false;
				for (int i = 0; i < charArr.length; i++) {
					stringChar = charArr[i];
					if ((stringChar == '{') || (stringChar == '[') || (stringChar == '(')) {
						cStack.push(stringChar);
					} else {
						if (!cStack.isEmpty()) {
							stackChar = cStack.pop();
							control = ((stringChar == '}') && (stackChar == '{'))
									|| ((stringChar == ']') && (stackChar == '['))
									|| ((stringChar == ')') && (stackChar == '('));
							if (!control) {
								result = 0;
								break;
							}
						} else {
							result = 0;
							break;
						}
					}
				}
				if (!cStack.isEmpty())
					result = 0;
			}
		}

		return result;
	}

	public int solution2(String S) {// %100
		Stack<Character> stack = new Stack<Character>();
		if (null == S) {
			return 0;
		} else if (S.isEmpty()) {
			return 1;
		}
		for (Character C : S.toCharArray()) {

			switch (C) {
			case ')':
				pops(stack, '(');
				break;
			case '}':
				pops(stack, '{');
				break;
			case ']':
				pops(stack, '[');
				break;

			default:
				stack.push(C);
				break;
			}

		}
		return stack.isEmpty() ? 1 : 0;
	}

	private static void pops(Stack<Character> s, Character C) {

		while (!s.isEmpty() && s.peek() != C) {
			s.pop();
		}
		if (!s.isEmpty()) {
			s.pop();
		} else {
			s.push(C);
		}
	}
}
