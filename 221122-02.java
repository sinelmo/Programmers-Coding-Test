// 모스부호 (1)
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] letters = letter.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(String i : letters) {
            for(int j = 0; j < mos.length; j++) {
                if(i.equals(mos[j])) {
                    sb.append((char)(j + 97));
                }
            }
        }
        
        return answer = sb.toString();
    }
}
