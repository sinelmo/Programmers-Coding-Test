// 제곱수 판별하기
class Solution {
    public int solution(int n) {
        int answer = 2;
        int i = 1;
        
        while(i * i <= n) {
            if(n == i * i) {
                answer = 1;
                break;
            }
            i++;
        }
        
        return answer;
    }
}
