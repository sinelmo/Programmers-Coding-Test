// 한 번만 등장한 문자
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] cnt = new int[26];
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 97]++;
        }
        
        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] == 1) {
                sb.append((char)(i + 97));
            }
        }
        
        return answer = sb.toString();
    }
}
