// 369게임
class Solution {
    public int solution(int order) {
        int answer = 0;
        String samyookgu = Integer.toString(order);
        
        for(int i = 0; i < samyookgu.length(); i++) {
            if((int)(samyookgu.charAt(i) - 48) % 3 == 0 && (int)(samyookgu.charAt(i) - 48) != 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
