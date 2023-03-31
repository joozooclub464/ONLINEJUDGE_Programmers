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
//처음에는 아스키 코드 사용해서 대문자 추출 후 소문자로 바꿔주려고 했었음.
//갑자기 uppercase가 생각나서 방법을 바꿈.
//split 한 후 소문자로 바꾸고 나서 sort하려 했으나 검색찬스를 써서 str.toLowerCase().split("")으로 바로 배열에 넣고 sort해줌
