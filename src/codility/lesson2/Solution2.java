package codility.lesson2;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(sol.solution(arr));
	}
	public int solution(int[] A) {
		int result = 0, count = 0;
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(Integer i : A) {
			if(map.containsKey(i))
			{
				count = (int)map.get(i);
				map.remove(i);
				map.put(i, ++count);
			}else {
				map.put(i, 1);
			}
		}
		for(Integer i : map.keySet()) {
			if((map.get(i)%2)==1) {
				result = i;
				break;
			}
		}
		
		return result;
	}
}
