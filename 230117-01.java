// 최소직사각형
import java.util.Arrays;
import java.lang.*;

class Solution {
    public int solution(int[][] sizes) {
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        
        for(int i = 0; i < sizes.length; i++) {
            a = Math.max(sizes[i][0], a);
            b = Math.max(sizes[i][1], b);
        }
        
        return a * b;
    }
}

//-------------------------다른사람의 풀이 ----------------------class Solution {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
