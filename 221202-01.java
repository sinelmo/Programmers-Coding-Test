// 문자열 정렬하기 (2)
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char str[] = new char[my_string.length()];
        StringBuilder sb = new StringBuilder();
        
        answer = my_string.toLowerCase();
        
        for(int i = 0; i < my_string.length(); i++) {
            str[i] = answer.charAt(i);
        }
        
        Arrays.sort(str);
        
        for(int i = 0 ; i < my_string.length(); i++) {
            sb.append(str[i]);
        }
        
        return answer = sb.toString();
    }
}
