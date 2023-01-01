// 문자열 내림차순으로 배치하기
import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        return new StringBuilder(String.valueOf(arr)).reverse().toString();
    }
}
