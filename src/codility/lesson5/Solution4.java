package codility.lesson5;

public class Solution4 {
	 public int solution(int[] A) {
	        int countOne = 0, result = 0, n=A.length; 
	        while (n >= 1) 
	        { 
	            if (A[n-1] == 1) 
	                countOne++; 
	            else
	                result += countOne; 
	            n--; 
	            
	            if(result>1000000000)
	                return -1;
	        } 
	        return result; 
	    }
}
