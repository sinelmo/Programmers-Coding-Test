// 팩토리얼
class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1;
        int i = 1;
        
        while(true) {
            fac = fac * i;
            System.out.println(fac + ", " + n + ", " + i);
            
            i++;
            
            if(fac == n) {
                i = i - 1;
                break;
            } else if (fac > n) {
                i = i - 2;
                break;
            }
        }
        
        return answer = i;
    }
}
