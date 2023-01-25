// 두 개 뽑아서 더하기
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i != j && list.indexOf(numbers[i] + numbers[j]) < 0) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        answer=list.stream().mapToInt(Integer::valueOf).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}
