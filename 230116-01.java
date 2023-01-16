// 시저 암호
class Solution {
    public String solution(String s, int n) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append(s.charAt(i));
            } else if((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90) { //A~Z
                sb.append((char)(((int)(s.charAt(i) + n) - 65) % 26 + 65));
            } else {
                sb.append((char)(((int)(s.charAt(i) + n) - 97) % 26 + 97));
            }
        }
        
        return sb.toString();
    }
}
