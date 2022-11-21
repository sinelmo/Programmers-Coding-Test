// 외계행성의 나이
class Solution {
    public String solution(int age) {
        String answer = "";
        String num = "";
        char ch = ' ';
        StringBuilder sb = new StringBuilder();
        
        num = Integer.toString(age);
        
        for(int i = 0; i < num.length(); i++) {
            ch = (char)((int)num.charAt(i) - 48 + 97);
            sb.append(ch);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
