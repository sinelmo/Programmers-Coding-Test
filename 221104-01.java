// k의 개수(못풀었음)
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n = i; n<=j; n++) {
            if(Integer.toString(n).contains(Integer.toString(k))) {
                answer++;
                if(Integer.toString(n).matches("(.*)"+Integer.toString(k)+"(.*)"+Integer.toString(k)+"(.*)")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}

// 왜 틀렸는지 모르겠음.
// 이거 틀린 이유 : 정규식으로 찾는건 5가 2번 포함된거만 찾는거 3번포함이든 4번포함이든 그 숫자를 세는건 아님.
