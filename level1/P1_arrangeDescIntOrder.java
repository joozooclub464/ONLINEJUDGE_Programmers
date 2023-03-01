//정수 내림차순으로 배치하기
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String ans = "";
        String [] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder()); //내림차순
        for(String a : str) {
            ans += a;
        }
        answer = Long.parseLong(ans); //Long형으로 형변환(리턴타입이 Long임)
        return answer;

    }
}
//처음에는 그냥 숫자를 분리해서 뒤집으면 되는줄 알았는데 아니었음.
//문자열 배열로 넣어준 후 sort해서 다시 형변환 해주는 방식으로 했는데 실패했음.
//처음에 string 배열로 분리해서 넣고 -> sort -> 다시 꺼내고 반복문 써서 string에 더해주는 형식으로..

//다른 풀이
//https://school.programmers.co.kr/learn/courses/30/lessons/12933/solution_groups?language=java
