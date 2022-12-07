// 안전지대
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    for(int a = 0; a < 3; a++) {
                        if(i - 1 + a >= board.length) {}
                        else if(i - 1 + a < 0) {}
                        else {
                            for(int b = 0; b < 3; b++) {
                                if(a == 1 && b == 1) {System.out.println("조건 1 위배");}
                                else if(j - 1 + b >= board.length) {System.out.println("조건 2 위배"); }
                                else if(j - 1 + b < 0) {System.out.println("조건 3 위배"); }
                                else if(board[i - 1 + a][j - 1 + b] == 1) {System.out.println((j - 1 + b) +"조건 4 위배");}
                                else {
                                    board[i - 1 + a][j - 1 + b] = -1;
                                    System.out.println((i - 1 + a )+ ", " + (j - 1 + b) + " = " + board[i - 1 + a][j - 1 + b]);
                                }
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
                if(board[i][j] == 0) {
                    answer++;
                }
            }
            System.out.println();
        }
        
        return answer;
    }
}
