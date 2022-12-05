// 캐릭터의 좌표
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = board[0] / 2;
        int y = board[1] / 2;
        int a = 0;
        int b = 0;
        
        for(String str : keyinput) {
            switch(str) {
                case "up" :
                    b++;
                    break;
                case "down" :
                    b--;
                    break;
                case "left" :
                    a--;
                    break;
                case "right" :
                    a++;
                    break;
            }
            
            if(a > x) a = x;
            if(a < -x) a = -x;
            if(b > y) b = y;
            if(b < -y) b = -y;
        }
        
        int[] answer = {a, b};
        
        return answer;
    }
}
