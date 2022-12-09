// 문자열 밀기
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuilder a = new StringBuilder(A);
        
        if(!A.equals(B)) {
            for(int i = 1; i <= A.length(); i++) {
                a.insert(0, a.charAt(a.length() - 1));
                a.deleteCharAt(a.length() - 1);
                answer++;
                if(a.toString().equals(B)) {
                    break;
                }
                if(i == A.length()) {
                    answer = -1;
                }
            }
        }
        
        return answer;
    }
}
