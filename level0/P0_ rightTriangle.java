//직각삼각형 출력하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //다른풀이
        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
    }
}
// string.repeat(반복횟수) : 주어진 문자열을 옵션의count만큼 반복하여 붙인다음에 새로운 문자열로 반환하는 함수
