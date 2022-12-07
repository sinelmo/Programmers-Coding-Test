// 안전지대
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    for(int a = -1; a < 2; a++) {
                        for(int b = -1; b < 2; b++) {
                            try {
                                if(board[i + a][j + b] != 1) {
                                    board[i + a][j + b] = -1;
                                }
                            } catch(Exception e) {}
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
