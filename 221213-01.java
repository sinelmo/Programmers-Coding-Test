// 유한소수 판별하기
class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        for(int i = 2; i <= a; i++) {
            if(a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        
        for(int i = 2; i <= b; i++) {
            if(b % i == 0) {
                if(!(i % 2 == 0 || i % 5 == 0)) {
                    answer = 2;
                }
            }
        }
        
        return answer;
    }
}
