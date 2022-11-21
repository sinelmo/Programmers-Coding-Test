// 진료 순서 정하기
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++) {
            answer[i] = emergency[i];
        }
        
        Arrays.sort(emergency);
        
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(answer[i] == emergency[j]) {
                    answer[i] = emergency.length - j;
                    break;
                }
            }
        }
        
        return answer;
    }
}
