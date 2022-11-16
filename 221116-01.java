// 분수의 덧셈
import java.lang.Math;

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int son = 0;
        int mom = 0;
        int c = 0;
        
        mom = num1 * num2;
        son = denum1 * num2 + denum2 * num1;
        
        for(int i = 1; i <= Math.min(mom, son); i ++) {
            if(mom % i == 0 && son % i == 0) {
                c = i;
            }
        }
        
        answer[0] = son / c;
        answer[1] = mom / c;
        
        return answer;
    }
}

// 오답 >> 테스트 케이스 3 12 3 12 [1,2]
import java.lang.Math;

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int son = 0;
        int mom = 0;
        int c = 0;
        
        mom = num1 * num2;
        son = denum1 * num2 + denum2 * num1;
        
        for(int i = 1; i <= Math.min(mom, son); i ++) {
            if(mom % i == 0 && son % i == 0) {
                mom = mom / i;
                son = son / i;
                System.out.println(son + " / " + mom + " % " + i);
            }
        }
        
        answer[0] = son;
        answer[1] = mom;
        
        return answer;
    }
}
