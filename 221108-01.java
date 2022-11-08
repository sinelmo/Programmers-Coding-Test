// 가까운 수
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length - 1; i++) {
            if(Math.abs(n - array[i]) > Math.abs(n - array[i + 1])) {
                answer = array[i + 1];
            } else if(Math.abs(n - array[i]) == Math.abs(n - array[i + 1])) {
                answer = array[i];
            }
        }
        
        return answer;
    }
}
