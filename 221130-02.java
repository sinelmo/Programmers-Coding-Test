// 약수 구하기
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> yaksu = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                yaksu.add(i);
            }
        }
        
        int[] answer = new int[yaksu.size()];
        
        for(int i = 0; i < yaksu.size(); i++) {
            answer[i] = yaksu.get(i);
        }
        
        return answer;
    }
}
