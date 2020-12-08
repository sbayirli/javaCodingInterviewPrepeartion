package codility.lesson3;


public class Solution3 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] arr = {3,1,2,4,3};
		System.out.println(sol.solution(arr));
	}
	public int solution(int[] A) {
        // write your code in Java SE 8
		 int len = A.length;
	        if(len==1) {
	            return Math.abs(A[0]);
	        } else if(len==2) {
	            return Math.abs((A[0]-A[1]));
	        }
	        double sum = 0;
	        for(int val : A) {
	            sum = sum+val;
	        }
	        double leftSum = 0, difference = 0, minimum = Integer.MAX_VALUE;

	        for(int i=0; i<len-1; i++) {
	            leftSum = leftSum + A[i];
	            difference = sum - 2*leftSum;//right = sum-left and diff=right-left so diff = sum-left-left 
	           
	            minimum = Math.min(Math.abs(difference), minimum);
	        }
	        return (int) minimum;
    }
}
