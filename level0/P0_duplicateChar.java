//중복된 문자
// import java.util.*;
// import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        // String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.indexOf(my_string.charAt(i)) == i) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
      
      //다른 풀이 1
      return Arrays.stream(myString.split("")).distinct().collect(Collectors.joining());
      
      //다른 풀이 2
      //중복X set의 특성 用
      String[] answer = my_string.split("");
      Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

      return String.join("", set); 
      
    }
}
//처음에는 split하여 배열에 넣고 비교하려고 했음
//indexOf는 처음 검색되는 위치를 반환함 -> my_string.indexOf(my_string.charAt(i))가 i와 같으면 중복되지 않은 문자 -> 해당 문자를 answer에 추가
