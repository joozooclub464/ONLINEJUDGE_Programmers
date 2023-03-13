//7의 개수
import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] array) {
        String str = "";
        for(int i:array) {
            str+= i;
        }
        return str.length() - str.replace("7","").length();
        
        //다른 풀이
        return (int) Arrays.stream(
                    Arrays.stream(array)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining())
                        .split("")
        )
        .filter(s -> s.equals("7"))
        .count();
    }
}
//스트림 사용해서 풀고싶었는데 replace 쓰는 것으로 해결했음.
//다른 분이 풀어주신것 봤는데 내가 하고 싶었던 방법이라 첨부했다.
