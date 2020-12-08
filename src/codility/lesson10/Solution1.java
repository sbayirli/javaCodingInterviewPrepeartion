package codility.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public int solution(int N) {
        List<Integer> list = new ArrayList<>();
        if(N<1)
            return 0;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (N / i == i) {
                    list.add(i);
                }
                else {
                    list.add(i);
                    list.add(N/i);
                }
            }
        }
        return list.size();
    }
}
