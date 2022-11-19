// 삼각형의 완성조건(1)
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        if(sides[2] >= sides[0] + sides[1]){            answer = 2;
            } else {
            answer = 1;
            }
        
        return answer;
    }
}
