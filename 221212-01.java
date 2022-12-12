// 치킨 쿠폰
class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(true) {
            answer += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
            
            if((chicken) / 10 == 0) {
                break;
            }
        }
        
        return answer;
    }
}
