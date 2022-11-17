// 피자 나눠 먹기
class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(true) {
            if(answer * 6 % n == 0) {
                break;
            } else {
                answer++;
            }
        }
        
        return answer;
    }
}
