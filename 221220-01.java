// 겹치는 선분의 길이 (내가 푼거 아님)
class Solution {
    public int solution(int[][] lines) {
        // 1. arr 배열 및 변수 초기화
        int[] arr = new int[200];
        int answer = 0;
        
        // 2. lines 정보를 arr 배열에 적용
        for(int i = 0; i < lines.length; i++)
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;
        
        // 3. arr 배열에서 겹친 부분 세기
        for(int i = 0; i < 200; i++)
            if(arr[i] > 1)
                answer++;
        
        return answer;
    }
  }
