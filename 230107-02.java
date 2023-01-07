// 이상한 문자 만들기
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append(' ');
                idx = 0;
            } else {
                if(idx % 2 == 0) {
                    sb.append(toUpperCase(s.charAt(i)));
                } else {
                    sb.append(toLowerCase(s.charAt(i)));
                }
                idx++;
            }
        }
        
        return sb.toString();
    }
}
