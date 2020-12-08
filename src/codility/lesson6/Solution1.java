package codility.lesson6;

import java.util.Arrays;

public class Solution1 {
	  public int solution(int[] A) {
	        // write your code in Java SE 8
	        int result= 0, length = A.length;
	        if(length>0){
	            Arrays.sort(A);
	            if(A[0]==A[length-1])
	                result = 1;
	            else{
	                result = 1;
	                for(int i = 1; i< A.length; i++){
	                    if(A[i]!=A[i-1])
	                        result ++;
	                }
	            }
	        }else{
	            result = 0;
	        }
	        return result;
	    }
}
