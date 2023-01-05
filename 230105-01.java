// 최댓값과 최솟값
import java.util.*;

class Solution {
    public String solution(String s) {
        String[] list = s.split(" ");
        int[] num = {Integer.parseInt(list[0]), Integer.parseInt(list[0])};
        
        for(String str : list) {
            num[0] = num[0] > Integer.parseInt(str) ? Integer.parseInt(str) : num[0];
            num[1] = num[1] < Integer.parseInt(str) ? Integer.parseInt(str) : num[1];
        }
        
        return num[0] + " " + num[1];
    }
}
