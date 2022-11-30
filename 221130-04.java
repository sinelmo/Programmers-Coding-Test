// 문자열 계산하기
import java.math.BigInteger;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String result[] = my_string.split(" ");
        
        for(int i = 0; i < result.length; i++) {
            if(i == 0) {
                answer = Integer.parseInt(result[i]);
            } else if(result[i].equals("+")) {
                answer += Integer.parseInt(result[i + 1]);
            } else if(result[i].equals("-")) {
                answer -= Integer.parseInt(result[i + 1]);
            }
        }
        
        return answer;
    }
}
