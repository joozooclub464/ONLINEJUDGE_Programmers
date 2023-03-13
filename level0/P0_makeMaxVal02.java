//최댓값 만들기(2)
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        // for(int i:numbers) {
        //     System.out.print(i); //배열 오름차순정리 확인
        // }
        int ans1 = numbers[numbers.length-1] * numbers[numbers.length-2];
        int ans2 = numbers[0] * numbers[1];
        return answer = (ans1>ans2?ans1:ans2);
      
        //다른 풀이
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
       
    }
}
