// OX퀴즈
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int dap = 0;
        
        for(int i = 0; i < quiz.length; i++) {
            String[] form = quiz[i].split(" ");
            
            for(int j = 0; j < form.length; j++) {
                switch(form[j]) {
                    case "+" :
                        dap = Integer.parseInt(form[j-1]) + Integer.parseInt(form[j+1]);
                        //System.out.println(Integer.parseInt(form[j-1]) + "+" + Integer.parseInt(form[j+1]) + "=" + dap);
                        break;
                    case "-" :
                        dap = Integer.parseInt(form[j-1]) - Integer.parseInt(form[j+1]);
                        //System.out.println(Integer.parseInt(form[j-1]) + "-" + Integer.parseInt(form[j+1]) + "=" + dap);
                        break;
                    case "=" :
                        if(dap == Integer.parseInt(form[j+1])) {
                            answer[i] = "O";
                        } else {
                            answer[i] = "X";
                        }
                        break;
                }
            }
        }
        
        return answer;
    }
}
