package leetcode;

/*
 * leetcode 2. Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/
 * */

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum = 0, carry = 0, val = 0, val1 = 0, val2 = 0;
		ListNode dummyHead = new ListNode(0);
		ListNode result = dummyHead;
		while (l1 != null || l2 != null) {
			val1 = (l1 == null) ? 0 : l1.val; // 5
			val2 = (l2 == null) ? 0 : l2.val; // 5

			sum = val1 + val2 + carry;// 10
			val = sum % 10;// 0
			carry = sum / 10;// 1

			result.next = new ListNode(val);//
			result = result.next;

			l1 = (l1 == null) ? null : l1.next;
			l2 = (l2 == null) ? null : l2.next;
		}
		if (carry > 0)
			result.next = new ListNode(carry);
		return dummyHead.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
