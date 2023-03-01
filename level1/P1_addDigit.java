//자릿수 더하기
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] strs = str.split("");
        for(int i=0; i<strs.length;i++) {
            answer += Integer.parseInt(strs[i]);
        }

        return answer;
    }
}
//다른 풀이
// while(true){
//     answer+=n%10;
//     if(n<10)
//         break;

//     n=n/10;
// }
//수학적 사고가 중요함을 느낌.
