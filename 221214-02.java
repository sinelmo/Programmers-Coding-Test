// 이진수 더하기
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
        
        return answer;
    }
}
