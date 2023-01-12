// 3진법 뒤집기
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String sam = Integer.toString(n, 3);
        
        StringBuilder sb = new StringBuilder(sam);
        
        sb.reverse();
        
        answer = Integer.parseInt(sb.toString(), 3);
        
        return answer;
    }
}
