//문자 반복 출력하기
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] anschar = my_string.toCharArray();
        
        for(int i=0; i<anschar.length; i++) {
            for(int j=0; j<n; j++) {
                answer += anschar[i];
            }
        }
        return answer;
      
      //다른풀이 1
//       StringBuffer sb = new StringBuffer();
//       for(char c : my_string.toCharArray(){
//           sb.append((c + "").repeat(n)); 
//       }
//           return sb.toString();
      //다른풀이 2
//       String[] str = my_string.split("");
//       for(int i=0; i<my_string.length(); i++) {
//           answer += str[i].repeat(n);
//       }
//       return answer;

    }
}

//string.toCharArray(); : 문자열을 한 글자씩 쪼개서 char타입의 배열에 넣어주는 메소드
//입력받은 문자열을 char형 배열에 넣고, 배열의 항목마다 n번씩 반복하여 answer문자열에 추가해줌.
