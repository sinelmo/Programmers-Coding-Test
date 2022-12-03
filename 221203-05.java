// 최댓값 만들기 (2)
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        if(numbers[0] * numbers[1] > numbers[numbers.length - 1] * numbers[numbers.length - 2]) {
            answer = numbers[0] * numbers[1];
        } else {
            answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        }
        
        return answer;
    }
}
