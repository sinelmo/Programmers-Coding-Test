// 직사각형 넓이 구하기
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = dots[0][0];
        int minWidth = dots[0][0];
        int height = dots[0][1];
        int minHeight = dots[0][1];
        
        for(int i = 0; i < 3; i++) {
            if(width < dots[i][0]) {
                width = dots[i][0];
            } 
            
            if(minWidth > dots[i][0]) {
                minWidth = dots[i][0];
            }
            
            if(height < dots[i][1]) {
                height = dots[i][1];
            }
            
            if(minHeight > dots[i][1]) {
                minWidth = dots[i][1];
            }
        }
        
        //System.out.println(width + ", " + minWidth + ", " + height + ", " + minHeight);
        
        answer = (width - minWidth) * (height - minHeight);
        
        return answer;
    }
}
