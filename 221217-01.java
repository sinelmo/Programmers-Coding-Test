// 나누어 떨어지는 숫자 배열
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i : arr) {
            if(i % divisor == 0) {
                list.add(i);
            }
        }
        
        if(list.isEmpty()) {
            list.add(-1);
        }
        
        int[] answer = list.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        
        return answer;
    }
}
