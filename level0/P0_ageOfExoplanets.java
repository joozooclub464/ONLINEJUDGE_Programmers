//외계행성의 나이
import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        char[] age962 = {'a','b','c','d','e','f','g','h','i','j'};
        int agelength = (int)(Math.log10(age)+1); //age 자릿수 구하는 수학공식
        
        //age의 숫자를 자리별로 나눠서 해당 인덱스에 있는 알파벳 리턴
        for(int i=0; i<agelength; i++) {
            answer += age962[age%10];
            age = age/10;
        }
        //일의 자리수부터 answer스트링에 들어가기 때문에 StringBuffer 用 뒤집어줌
        StringBuffer sb = new StringBuffer(answer); 
        return answer = sb.reverse().toString();
        
        //스트림 사용한 방법
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
        //import java.util.stream.Collectors; 임포트 해주고..
    }
}
//실패한 방법
//stream 用 int값 자릿수별로 나눠서 배열에 넣기 -> indexOf()는 해당 문자열의 인덱스 위치를 반환하는것인디 인덱스 위치의 문자를 반환하는것으로 착각함.입력하자..
// int[] arrage = Stream.of(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray();
// System.out.print(Arrays.toString(arrage));
