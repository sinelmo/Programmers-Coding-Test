// 인덱스 바꾸기
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char ch = ' ';
        
        StringBuilder sb = new StringBuilder(my_string);
        ch = my_string.charAt(num1);
        
        sb.setCharAt(num1, my_string.charAt(num2));
        // System.out.println(sb);
        
        sb.setCharAt(num2, ch);
        // System.out.println(sb);
        
        answer = sb.toString();
        
        return answer;
    }
}
