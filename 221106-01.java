// 소인수분해
import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> primeList = new ArrayList<>();
        
        for(int i = 2; i <= n; i++) {
            if(pNum(i)) {
                if(n % i == 0) {
                    primeList.add(i);
                }
            }
        }
        
        answer = primeList.stream().mapToInt(i -> i).toArray();
        
        System.out.println(primeList);
        
        return answer;
    }
    
    public boolean pNum(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
