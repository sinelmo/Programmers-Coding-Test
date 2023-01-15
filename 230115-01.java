// 예산
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int num = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++) {
            num += d[i];
            if(num > budget) {
                break;
            } else if(i == d.length - 1) {
                answer = i + 1;
            } else if(num + d[i+1] > budget) {
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}

// -----------------------------다른 사람의 기똥찬 풀이-----------------------
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int num = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++) {
            num += d[i];
            
            if(budget - num < 0) {
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
}
