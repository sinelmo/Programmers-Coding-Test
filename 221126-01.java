// 컨트롤 제트 (못풀었음)
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] sp = s.split(" ");
        
        for(int i = 0; i < sp.length; i++) {
            if(!sp[i].equals("Z")) {
                answer += Integer.parseInt(sp[i]);
            } else if(i > 0) {
                if(!sp[i - 1].equals("Z")) {
                    answer -= Integer.parseInt(sp[i - 1]);
                }
            } 
        }
        
        return answer;
    }
}
