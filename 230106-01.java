// 최대공약수와 최소공배수
class Solution {
    public int[] solution(int n, int m) {
        int answer[] = new int[2];
        answer[1] = n * m;
        
        while(n % m != 0) {
            int r = n % m;
            n = m;
            m = r;
            System.out.println("n : " + n + "m : " + m);
        }
        
        answer[0] = m;
        answer[1] /= m;
        
        return answer;
    }
}
