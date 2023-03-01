//제곱수 판별하기
import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        Double r = Math.sqrt(n);
        if(r == r.intValue()) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
        //다른풀이
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
//n의 제곱근
//Math.sqrt(n);
//intValue()
// :) - Integer객체에서 int형 값을 뽑아내는 메소드. (Integer에는 intValue와 StringValue가 有)
//    - static이 아님.
//parseInt()
// :) - string형 객체에서 int값을 뽑아내는 메소드. 문자형을 정수형으로 만듦.
//    - static 이므로 Integer생성 안 하고 parameter만 넣어주면 메소드 수행 可
