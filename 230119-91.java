// 삼총사
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i < number.length; i++) {
            for(int n = i + 1; n < number.length; n++) {
                for(int m = n + 1; m < number.length; m++) {
                    if(number[i] + number[n] + number[m] == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}
