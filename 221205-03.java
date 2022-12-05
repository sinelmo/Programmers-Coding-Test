// 다항식 더하기
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int s = 0;
        
        String[] exp = polynomial.split(" ");
        
        for(int i = 0; i < exp.length; i++) {
            if(exp[i].contains("x")) {
                if(exp[i].equals("x")) {
                    x++;
                } else {
                    exp[i] = exp[i].replace("x", "");
                    x += Integer.parseInt(exp[i]);
                }
            } else if(!exp[i].equals("+")) {
                s += Integer.parseInt(exp[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if(x > 0) {
            if(x > 1) {
               sb.append(x);
            }
            sb.append("x");
        } if(x > 0 && s > 0) {
            sb.append(" + ");
        } if(s > 0) {
            sb.append(s);
        }
        
        return answer = sb.toString();
    }
}
