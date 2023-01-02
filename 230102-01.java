// 약수의 개수와 덧셈
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            if(yaksu(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
    
    public int yaksu(int n) {
        int count = 0;
        for(int i = 1; i <=n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        
        return count;
    }
}
