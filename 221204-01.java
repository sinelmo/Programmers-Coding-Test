// 7의 개수
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String[] str = Arrays.stream(array) // 배열 stream 생성
                        .mapToObj(String::valueOf) // IntStream을 stream으로 변환, 변환 시 String.valueOf()
                            .toArray(String[]::new); // stream을 Array로 변환
        
        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < str[i].length(); j++) {
                if(str[i].charAt(j) == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}

//---------------다른 사람의 기가막힌 풀이---------------------------
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            while(a != 0){
                if(a % 10 == 7){
                    answer++;
                }
                a /= 10;
            }
        }
        return answer;
    }
}
