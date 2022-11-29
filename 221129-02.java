// 컨트롤 제트
import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        String[] sp = s.split(" ");
        
        for(int i = 0; i < sp.length; i++) {
            if(!sp[i].equals("Z")) {
                answer += Integer.parseInt(sp[i]);
                list.add(Integer.parseInt(sp[i]));
            } else if(i > 0) {
                if(list.size() > 0) {
                    answer -= list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                } 
            } 
        }

        return answer;
    }
}
