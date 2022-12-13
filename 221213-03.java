// 특이한 정렬
import java.lang.Math;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] index = new int[numlist.length];
        int[] answer = new int[numlist.length];
        
        for(int i = 0; i < numlist.length; i++) {
            for(int j = 0; j < numlist.length; j++) {
                if(Math.abs(n - numlist[i]) > Math.abs(n - numlist[j])) {
                    index[i]++;
                } else if(Math.abs(n - numlist[i]) == Math.abs(n - numlist[j])) {
                    if(numlist[i] < numlist[j]) {
                        index[i]++;
                    }
                }
            }
        }
        
        for(int i = 0; i < numlist.length; i++) {
            answer[index[i]] = numlist[i];
        }
        
        return answer;
    }
}
