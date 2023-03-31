//문자열 정렬하기(2)
import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.toLowerCase().split("");
        
        Arrays.sort(str);
        for(int i=0; i<str.length; i++) {
            answer += str[i];
        }
        return answer;
    }
}
