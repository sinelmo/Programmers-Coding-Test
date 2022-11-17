// 숫자 찾기
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String compare = "";
        char ch = (char)(k + 48);
        
        compare = Integer.toString(num);
        
        System.out.println(k);
        System.out.println(ch);
        
        for(int i = 0; i < compare.length(); i++) {
            if(compare.charAt(i) == ch) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}
