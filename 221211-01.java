// 연속된 수의 합
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int aaa = total;
        int sum = 0;
        
        while(true) {
            for(int i = 0; i < num; i++) {
                answer[num - 1 - i] = aaa - i;
                //System.out.println("answer[" + (num - 1 - i) + "] : " + answer[num - 1 - i]);
                sum += answer[num -1 - i];
            }
            if(sum == total) {
                break;
            } else if(sum > total) {
                aaa--;
                //System.out.println("sum : " + sum);
            } else {
                aaa++;
            }
            sum = 0;
        }
        
        return answer;
    }
}
