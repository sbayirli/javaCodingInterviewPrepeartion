package codility.lesson4;

import java.util.Arrays;


public class Solution3 {
	public static void main(String[] args) {
		int[] arr = {1, 3, 6, 4, 1, 2};
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(arr));
	}
	public int solution(int[] A) {
        // write your code in Java SE 8
    	int result = 0, positiveIndex = -1, size = A.length;
        Arrays.sort(A);
        for(int i=0; i<A.length;i++){
            if(A[i]>0){
            	if(positiveIndex==-1)
            		positiveIndex  = i;
                if((i==positiveIndex)&&(A[positiveIndex]>1)) {
                    result = 1;
                    break;
                }
                else if((i>0)&&(i>positiveIndex)&&(A[i]-A[i-1]>1)) {
                    result = A[i-1]+1;
                    break;
                }
            }
        }
        if(result == 0)
        	result = A[size-1]+1;
        if(positiveIndex==-1)
        	result = 1;
        return result;
    }
}
