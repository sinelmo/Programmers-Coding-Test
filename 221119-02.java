// 특정 문자 제거하기
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        answer = my_string.replace(letter, "");
        
        return answer;
    }
}
