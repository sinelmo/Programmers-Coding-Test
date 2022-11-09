// 모음 제거
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowel = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i < vowel.length; i++) {
            my_string = my_string.replaceAll(vowel[i], "");
        }
        
        return answer = my_string;
    }
}
