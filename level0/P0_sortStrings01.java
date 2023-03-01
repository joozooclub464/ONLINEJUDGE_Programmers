//문자열 정렬하기(1)
import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String ans = "";
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i)>=48 && my_string.charAt(i)<=57) {
                ans += (char)my_string.charAt(i);
            }
        }
        System.out.println(ans); 
        int[] answer = new int[ans.length()];
        for(int i=0; i<ans.length(); i++) {
            answer[i] = Character.getNumericValue(ans.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
        
        //다른풀이
        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
//Character.getNumericValue() : char를 int로 형변환
