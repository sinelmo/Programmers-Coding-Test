// 문자열 다루기 기본
class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
            } catch(Exception e) {
                return false;
            }
            
            return true;
        }
        
        return false;
    }
}
