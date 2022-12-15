// 겹치는 선분의 길이
import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Arrays.sort(lines, Comparator.comparingInt(o1 -> o1[0]));
        ArrayList<Integer> line = new ArrayList<>();
        
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j <= lines[i][1] - lines[i][0]; j++) {
                for(int k = 0; k <= lines[i+1][1] - lines[i+1][0]; j++) {
                    if(lines[i][0] + j == lines[i+1][0] + k) {
                        line.add(lines[i][0] + j);
                        System.out.println(lines[i][0] + j);
                    }
                }
            }
        }
        
        return answer;
    }
}
// 이렇게 푸는거 아닌 것 같다 
