// 중앙값 구하기
import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        
        answer = array[array.length / 2];
        
        return answer;
    }
}
