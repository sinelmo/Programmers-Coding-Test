// 숫자 문자열과 영단어
class Solution {
    public int solution(String s) {
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < number.length; i++) {
            if(s.contains(number[i])) {
                s = s.replace(number[i], Integer.toString(i));
            }
        }
        
        return Integer.parseInt(s);
    }
}
