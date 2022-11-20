// 직각삼각형 출력하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                str = str + "*";
                if(j == i) {
                    str = str + "\n";
                }
            }
        }

        System.out.println(str);
    }
}
