// 최빈값 구하기 (못풀었음)
import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(array);

        for(int i : array) {
            if(!list.contains(i)) {
                list.add(i);
            }
        }
        // System.out.println(list);

        int[] count = new int[list.size()];

        for(int i : array) {
            for(int j = 0; j < count.length; j++) {
                if(i == list.get(j)) {
                    count[j]++;
                     //System.out.println("count[" + j + "] : " + count[j]);
                }
            }
        }

        max = count[0];
        if(array.length != 1) {
            for(int i = 1; i < count.length; i++) {
                if(max < count[i]) {
                    // System.out.println("max : " + max + " 보다 count[" + i + "] : " + count[i] + " 가 더 큽니다.");
                    max = count[i];
                    answer = list.get(i);
                } else if(max == count[i]) {
                    // System.out.println("max : " + max + " 가 count[" + i + "] : " + count[i] + " 와 같습니다.");
                    answer = -1;
                }
            }
        } else {
            answer = array[0];
        }

        return answer;
    }
}   
