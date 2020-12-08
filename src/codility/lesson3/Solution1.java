package codility.lesson3;

public class Solution1 {

    public int solution(int X, int Y, int D) {
        if(X==Y)
            return 0;
        else if(D>(Y-X))
            return 1;
        else{
            int diff = Y-X;
            int count = diff/D;
            if((diff%D)>0)
                return count+1;
            else
                return count;
        }
    }

}
