// 중복된 문자 제거
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 0; i < my_string.length(); i++) {
                if(sb.indexOf(String.valueOf(my_string.charAt(i))) < 0) {
                    sb.append(my_string.charAt(i));
                }
        }

        
        
        return answer = sb.toString();
    }
}
