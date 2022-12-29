// 제일 작은 수 제거하기
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[] {-1};
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr) {
            list.add(i);
        }
        
        int min = 0;
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(min) > list.get(i)) {
                min = i;
            }
        }
        
        list.remove(min);
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
