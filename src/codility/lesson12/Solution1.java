package codility.lesson12;

public class Solution1 {
	  public int solution(int N, int M) {//%75 because of %50 performance problem
	        // write your code in Java SE 8
	        int count = 1, mod = M%N;
	        
	        while(mod!=0){
	            count ++;
	            mod = (M+mod)%N;
	        }
	        return count;    
	    }
}
