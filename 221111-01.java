import java.util.ArrayList;

// 최빈값 구하기 (못풀었음) 
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : array) {
            if(!list.contains(i)) {
                list.add(i);
            }
        }
        System.out.println(list.size());
        
        int[] count = new int[list.size()];
        
        for(int i : array) {
            for(int j = 0; j < count.length; j++) {
                if(i == list.get(j)) {
                    count[j]++;
                }
            }
        }
        
        max = count[0];
        
        for(int i = 0; i < count.length; i++) {
            if(max < count[i]) {
                answer = list.get(i);
            }
        }
        
        return answer;
    }
}   
