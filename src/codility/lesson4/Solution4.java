package codility.lesson4;

import java.util.Arrays;

public class Solution4 {
	public int solution(int[] A) {
        // write your code in Java SE 8
        double totalSum = 0, checkSum = 0, length =A.length;
        checkSum = (length*(length+1))/2;
        for(Integer i : A)
            totalSum +=i;
        if(totalSum == checkSum)
            return 1;
        else
            return 0;
    }
	  public int solution2 (int[] A){
	        int expectedInt = 1, missingInt = 0, result = 0;
	   
	         //Check if the length is zero
	        if (A.length == 0) {
	        	result = 0;
	        }
	        else if( A.length > 0 ){
	            
		        //sort the array
		        Arrays.sort(A);
		        
	            for (int x : A){ //loop to find the missing int
	                if (x == expectedInt){
	                    expectedInt++;
	                } else {
	                    missingInt = expectedInt;
	                    break;
	                }
	            }
	        } 
	        //final check of the missing int
	        result = missingInt > 0 ? 0 : 1;
	        
	        return result; 
	    }
}
