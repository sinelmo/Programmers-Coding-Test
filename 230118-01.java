// [1차] 비밀지도 (못풀엇음)
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(String.format("%0" + n + "d", Integer.parseInt(Integer.toString(arr1[i], 2))));
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(String.format("%0" + n + "d", Integer.parseInt(Integer.toString(arr2[i], 2))));
        }
        
        return answer;
    }
}
