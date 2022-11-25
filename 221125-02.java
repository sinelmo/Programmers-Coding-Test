// 합성수 찾기
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            if(hap(i)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean hap(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return true;
            }
        }
        
        return false;
    }
}
