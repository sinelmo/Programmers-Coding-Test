// 직사각형 넓이 구하기 왜틀린지 모르겟음
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = max(0, dots) - min(0, dots);
        int length = max(1, dots) - min(1, dots);
        
        return answer = width * length;
    }
    
    public int max(int axis, int[][] dots) {
        int max = dots[0][axis];
        
        for(int i = 0; i < 3; i++) {
            if(max < dots[i][axis]) {
                max = dots[i][axis];
            }
        }
        
        return max;
    }
    
    public int min(int axis, int[][] dots) {
        int min = dots[0][axis];
        
        for(int i = 0; i < 3; i++) {
            if(min > dots[i][1]) {
                min = dots[i][1];
            }
        }
        
        return min;
    }
}
