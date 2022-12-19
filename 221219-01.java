// 평행
import java.util.ArrayList;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double inc = 0;
        ArrayList<Double> list = new ArrayList<>();
        // 기울기 구하는 식 : (a, b) (c, d) 일 때
        // d - b / c - a
        
        for(int i = 0; i < dots.length; i++) {
            for(int j = i; j < dots.length; j++) {
                if(dots[j][0] - dots[i][0] != 0){
                    //System.out.println("["+dots[i][0]+", "+dots[i][1]+"]"+"["+dots[j][0]+", "+dots[j][1]+"]");
                    //System.out.println("dots["+j+"][1] - dots["+i+"][1]) / (dots["+j+"][0] - dots["+i+"][0])");
                    //System.out.println(((double)dots[j][1] - (double)dots[i][1]) + " / " + ((double)dots[j][0] - (double)dots[i][0]));
                    inc = ((double)dots[j][1] - (double)dots[i][1]) / ((double)dots[j][0] - (double)dots[i][0]);
                    //System.out.println(inc);
                    if(list.indexOf(inc) < 0) {
                        list.add(inc);
                        //System.out.println("추가 : " + inc);
                    } else {
                        //System.out.println("같아요 : " + inc);
                        answer = 1;
                    }
                }
            }
        }
        
        return answer;
    }
}
