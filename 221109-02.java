// 숨어있는 숫자의 덧셈 (1)
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            if(numbers(my_string.charAt(i))) {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
        }
        return answer;
    }
    
    public boolean numbers(char ch) {
        for(int i = 1; i < 10; i ++) {
            if(Character.getNumericValue(ch) == i) {
                return true;
            }
        }
        return false;
    }
}

// ---------------- 다른사람의 기가막힌 풀이 ---------------------
class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>48 && s.charAt(i)<58){
                answer += Integer.parseInt("" + s.charAt(i)) ;
            }
        }

        return answer;
    }
}
