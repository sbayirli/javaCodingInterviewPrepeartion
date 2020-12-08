package codility.lesson3;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 sol2 = new Solution2();
		int[] arr = new int[100000];
		for(int i=0;i<100000;i++)
			arr[i] =i+2;
		
		System.out.println(sol2.solution(arr));
	}
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        int total = 0,result = 0, length = A.length;
	        int goalTotal = 0,i;
	        
	        for(i=0;i<A.length; i++){
	           goalTotal +=(i+1);
	           total+=A[i];
	        }
	        
	        goalTotal +=i+1;
	        result = goalTotal - total;
	        return result;
	    }
}
