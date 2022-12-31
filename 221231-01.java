// 없는 숫자 더하기
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : numbers) {
            list.add(i);
        }
        
        for(int i = 0; i < 10; i++) {
            if(list.indexOf(i) < 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}
