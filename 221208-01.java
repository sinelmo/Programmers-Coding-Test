// 삼각형의 완성조건 (2)
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int c = 0;
        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1];
        
        c = a + b - 1;
        
        if(c == b) {
            c -= 1;
            answer++;
        } else {
            while(b <= c) {
                c--;
                answer++;
            }
        }
        
        c = b - a + 1; 
      
        while(c < b) {
            c++;
            answer++;
        }
        
        return answer;
    }
}
