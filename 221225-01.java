// 정수 내림차순으로 배치하기
import java.util.*;
import java.lang.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String num = Long.toString(n);
        int[] list = new int[num.length()];
        
        for(int i = 0; i < num.length(); i++) {
            list[i] = (int)num.charAt(i) - 48;
        }
        
        Arrays.sort(list);
        
        for(int i = 0; i < list.length; i++) {
            answer += list[i] * Math.pow(10, i);
        }
        
        return answer;
    }
}
