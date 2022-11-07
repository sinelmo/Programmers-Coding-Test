// 2차원으로 만들기
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int num = 0;
        
        for(int i = 0; i < num_list.length / n; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[num];
                num++;
            }
        }
        
        return answer;
    }
}

// -------------------다른사람의 기가막힌 풀이--------------------- //

class Other Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        for(int i = 0; i < num_list.length; i++) {
            answer[i/n][i%n] = num_list[i];
        }
        
        return answer;
    }
}
