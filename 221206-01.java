// 숨어있는 숫자의 덧셈 (2)
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0 ; i < my_string.length(); i++ ) {
            StringBuilder sb = new StringBuilder();
            while(my_string.charAt(i) >= 48 && my_string.charAt(i) < 58) {
                sb.append(my_string.charAt(i));
                i++;
                if(i == my_string.length()) break;
            }
            try {
                answer += Integer.parseInt(sb.toString());   
            } catch (Exception e) {
            }
            
        }
        
        return answer;
    }
}
