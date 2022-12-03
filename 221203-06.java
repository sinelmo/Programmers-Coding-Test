// A로 B 만들기
import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String[] bsort = before.split("");
        String[] asort = after.split("");
        
        Arrays.sort(bsort);
        Arrays.sort(asort);
        
        for(int i = 0 ; i < before.length(); i++) {
            if(!bsort[i].equals(asort[i])) {
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}
