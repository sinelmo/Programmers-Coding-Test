// k의 개수
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String number = "123";
        char numK = (char)(k+48);
        
        for(int m = i; m <= j; m++) {
            number = Integer.toString(m);
            for(int n = 0; n < number.length(); n++) {
                if(number.charAt(n) == numK) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
