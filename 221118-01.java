// 체육복 (못풀었음)
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int j = 0; j < lost.length; j++) {
            for(int k = 0; k < reserve.length; k++) {
                if(lost[j] == reserve[k]) {
                    reserve[k] = -1;
                    lost[j] = -1;
                    answer++;
                } else if(lost[j] - 1 == reserve[k]) {
                    reserve[k] = -1;
                    lost[j] = -1;
                    answer++;
                } else if(lost[j] + 1 == reserve[k]) {
                    reserve[k] = -1;
                    lost[j] = -1;
                    answer++;
                }
            }
        }
        
        return answer; // 테스트 5 : answer - 2 // 테스트 12 : answer - 1
    }
}
