// 문자열 정렬하기(1)
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int num = 0;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(number(my_string.charAt(i))) {
                arr.add((int)my_string.charAt(i) - 48);
                num++;
            }
        }
        
        int[] answer = new int[num];
        
        for(int i = 0; i < num; i++) {
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
    
    public boolean number(char ch) {
        for(int i = 0; i < 10; i++) {
            if((int)ch-48 == i) {
                return true;
            }
        }
        return false;
    }
}

//------------------------------------다른사람의 기가막힌 풀이-----------------------------------------------
import java.util.*;

class Solution {
    public int[] solution(String myString) {
        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
