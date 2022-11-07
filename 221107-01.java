// 영어가 싫어요 
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        numbers = hateEng(numbers, "one", "1");
        numbers = hateEng(numbers, "two", "2");
        numbers = hateEng(numbers, "three", "3");
        numbers = hateEng(numbers, "four", "4");
        numbers = hateEng(numbers, "five", "5");
        numbers = hateEng(numbers, "six", "6");
        numbers = hateEng(numbers, "seven", "7");
        numbers = hateEng(numbers, "eight", "8");
        numbers = hateEng(numbers, "nine", "9");
        numbers = hateEng(numbers, "zero", "0");
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
    
    public String hateEng (String numbers, String english, String num) {
        numbers = numbers.replace(english, num);
        
        return numbers;
    }
}
