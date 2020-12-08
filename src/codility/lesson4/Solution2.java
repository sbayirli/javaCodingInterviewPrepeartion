package codility.lesson4;

public class Solution2 {
	public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];
        int max = 0, temp = 0, appliedMax = 0;
        boolean applyMax = false;
        
        for(int i=0 ; i<N ; i++)
            result[i] = 0;
        
        for(Integer elementA : A){
            if((elementA>=1)&&(elementA<=N)){
                temp = result[elementA - 1];
                if(applyMax&&(temp<appliedMax)) {
                	result[elementA - 1] = appliedMax+1;
                }
                else
                	result[elementA - 1] = temp+1;
                max = result[elementA - 1];
            }
            else if(elementA == N+1){
            	applyMax = true;
            	appliedMax = max;
            }
        }
        for(int i=0 ; i<N ; i++) {
        	temp = result[i];
        	if(temp<appliedMax)
            result[i] = appliedMax;
        }
        return result;
    }
	
	   public int[] solution2(int N, int[] A) {

	        final int condition = N + 1;
	        int currentMax = 0;
	        int lastUpdate = 0;
	        int countersArray[] = new int[N];

	        for (int iii = 0; iii < A.length; iii++) {
	            int currentValue = A[iii];
	            if (currentValue == condition) {
	                lastUpdate = currentMax;
	            } else {
	                int position = currentValue - 1;
	                if (countersArray[position] < lastUpdate)
	                    countersArray[position] = lastUpdate + 1;
	                else
	                    countersArray[position]++;

	                if (countersArray[position] > currentMax) {
	                    currentMax = countersArray[position];
	                }
	            }

	        }

	        for (int iii = 0; iii < N; iii++) {
	           if (countersArray[iii] < lastUpdate)
	               countersArray[iii] = lastUpdate;
	        }

	        return countersArray;
	    }
}
