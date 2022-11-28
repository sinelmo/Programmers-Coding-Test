// 대문자와 소문자
import java.lang.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= 97) {
                sb.append((char)(my_string.charAt(i) - 32));
            } else {
                sb.append((char)(my_string.charAt(i) + 32));
            }
        }
        
        return answer = sb.toString();
    }
}
