// 자릿수 더하기
public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        int len = num.length();
        
        for(int i = 0; i < len; i++) {            
            answer += (int)num.charAt(i) - 48;
        }

        return answer;
    }
}
