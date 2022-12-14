// 옹알이(1)
class Solution {
    public int solution(String[] babbling) {
        String[] ong = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < ong.length; j++) {
                babbling[i] = babbling[i].replace(ong[j], "1");
            }
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}
