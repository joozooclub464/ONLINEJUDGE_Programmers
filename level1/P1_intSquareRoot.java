//정수 제곱근 판별
import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        Double x = Math.sqrt(n);
        if(x == x.intValue()) { //x를 intValue한 값과 x값이 같으면 정수이다.
            answer = (long)Math.pow(x+1,2);    
        } else {
            answer = -1;
        }
        return answer;
        //다른 풀이
        //if (Math.pow((int)Math.sqrt(n), 2) == n) {
        //    return (long) Math.pow(Math.sqrt(n) + 1, 2);
        //}
        //return -1;
    }
}

//Math.sqrt()를 사용하니 두번쨰 테스트 케이스에서 3의 제곱근이 1.7320508...으로 나옴.
// x를 정수값으로 계산하지 않아서 생긴 문제. intValue()를 사용하여 정수값으로 반환해서 계산함.

//Math.sqrt(); : 제곱근 반환(전달된 double)형 값의 제곱근 값 반환
//Math.pow(밑,지수); : 제곱 연산자(전달된 두개의 double형 값을 가지고 연산 수행)
