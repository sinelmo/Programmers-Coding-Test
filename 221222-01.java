// 정수 제곱근 판별
import java.lang.*;

class Solution {
    public long solution(long n) {
        
        if(Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long)Math.pow(Math.sqrt(n)+1 , 2);
        }
        
        return -1;
    }
}
