//문자열 뒤집기
class Solution {
    public String solution(String my_string) {
        
        StringBuffer sb = new StringBuffer(my_string);
        return String answer = sb.reverse().toString();
        
        //다른풀이
        //StringBuffer sb = new StringBuffer();
        //sb.append(my_string);
        //sb.reverse();
        //return sb.toString();
    }
}
//String : 고정길이 불변문자열(String객체 변경시 새로운 객체 생성)
//StringBuffer : 변경 가능(그 객체 자체가 변경됨)
//StringBuilder : 변경 가능(그 객체 자체가 변경됨)
//StringBuffer는 thread-safe됨 -> 여러 쓰레드에서 해당 문자열에 동시에 접근할 때 用可
//StringBuilder는 그렇지 않은 경우에 用
