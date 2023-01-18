// [1차] 비밀지도
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < arr1.length; i++) {
            answer[i] = String.format("%0" + n + "d", Long.parseLong(Long.toString(arr1[i] | arr2[i], 2)))
                                                                                .replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
}
