// 최빈값 구하기
// 간단한 문제였음. 내가 너무 복잡하게 생각 한 것. array 원소의 최댓값이 정해져 있지 않다고 생각하고 문제를 어렵게 풀었음.
import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int freq[] = new int[1001];
        int max = 0;

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            freq[array[i]]++;
        }

        if(array.length != 1) {
            for(int i = 0; i < 1001; i++) {
                if(max < freq[i]) {
                    max = freq[i];
                    answer = i;
                } else if(max == freq[i]) {
                    answer = -1;
                }
            }
        } else {
            answer = array[0];
        }

        return answer;
    }
}   
