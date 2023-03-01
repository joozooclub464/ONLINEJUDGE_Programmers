//핸드폰 번호 가리기
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4,phone_number.length());
        return answer;
    }
}
//str.substring(시작지점,끝지점);
//str.substring(str.length()-4,str.length());

//다른 풀이1
char[] ch = phone_number.toCharArray();
for(int i = 0; i < ch.length - 4; i ++){
    ch[i] = '*';
}
return String.valueOf(ch);

//다른풀이2
return phone_number.replaceAll(".(?=.{4})", "*");
// 정규식 전방탐색 사용한 풀이 : 앞에서부터 특정 문자열을 찾는 방법
// . -> 임의의 문자 한 개 
// (?=.) -> 뒷쪽에 임의의 문자 한 개를 제외하고 선택
// {숫자} -> 숫자 만큼의 자릿수 
// .(?=.{4}) ==> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
