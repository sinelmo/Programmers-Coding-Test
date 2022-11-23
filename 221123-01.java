// 구슬을 나누는 경우의 수
import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer = new BigInteger("1");
        BigInteger up = new BigInteger("1");
        BigInteger down = new BigInteger("1");
        BigInteger down2 = new BigInteger("1");
        
        up = factorial(new BigInteger("" + balls));
        // System.out.println(up);
        
        down = factorial(new BigInteger("" + share));
        // System.out.println(down);
        
        down2 = factorial(new BigInteger("" + (balls - share)));
        // System.out.println(down2);
        
        down = down.multiply(down2);
        
        return answer = up.divide(down);
    }
    
    public BigInteger factorial(BigInteger num) {
        BigInteger fac = new BigInteger("1");
        for(int i = 1; i <= num.intValue(); i++) {
            fac = fac.multiply(new BigInteger("" + i));
        }
        
        return fac;
    }
}
