// 저주의 숫자3
class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = 0;
        
        for(int i = 0; i < n; i++) {
            number++;
            
            while(number % 3 == 0 || Integer.toString(number).contains("3")) {
                number++;
            }
        }
        
        answer = number;
        
        return answer;
    }
}
