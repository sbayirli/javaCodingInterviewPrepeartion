package codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
	 public int solution(int X, int[] A) {
	        // write your code in Java SE 8
	        int result = -1;
	        Set<Integer> set = new HashSet<Integer>();
	        for(int i=0; i<A.length; i++){
	            set.add(A[i]);
	            if(set.size()==X){
	                result = i;
	                break;
	            }
	        }
	        return result;
	    }
}
