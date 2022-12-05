// 잘라서 배열로 저장하기
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        
        if(my_str.length() % n == 0) {
            answer = new String[my_str.length() / n];
        } else {
            answer = new String[my_str.length() / n + 1];
        }
        
        StringBuilder sb = new StringBuilder(my_str);
        
        for(int i = 0; i < answer.length; i++) {
            if((i + 1) * n - 1 < my_str.length()) {
                answer[i] = sb.substring(i * n , (i + 1) * n);
            } else {
                answer[i] = sb.substring(i * n , my_str.length());
            }
        }
        
        return answer;
    }
}

// --------------다른 사람의 기가막힌 풀이--------------------------
class Solution {
    public String[] solution(String my_str, int n) {
        int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = start + n >= my_str.length()? my_str.length(): start + n;
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
