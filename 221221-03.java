// 자연수 뒤집어 배열로 만들기
class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        
        for(int i = 1; i <= answer.length; i++) {
            answer[answer.length - i] = num.charAt(i-1)-48;
        }
        
        return answer;
    }
}
