//대문자와 소문자
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        
        //처음 하려던 풀이
        //아스키코드로 계산하려고 했었음..
        //힘들게 아스키코드를 배열로 입력받고 그걸 다시 문자열로 형변환해주려 했었음..
        //바로 형변환해서 answer에 더해주면 될 일이었음...
        //A : 65  a : 97
        // for(int i=0; i<my_string.length(); i++) {
        //     if(my_string.charAt(i)<=90 && my_string.charAt(i)>=65) {
        //         answer += (char)(my_string.charAt(i)+32);
        //     }
        //     else if(my_string.charAt(i)>=97 && my_string.charAt(i)<=122) {
        //         answer += (char)(my_string.charAt(i)-32);
        //     }
        // }
        return answer;
    }
}
