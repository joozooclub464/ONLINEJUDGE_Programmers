//숨어있는 숫자의 덧셈(1)
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str= my_string.split("");
        for(int i=0; i<str.length;i++) {
            try{
                if(Integer.parseInt(str[i])<10) {
                    answer += Integer.parseInt(str[i]);
                }
            } catch(NumberFormatException e) {
                answer += 0;
            }
        }
        return answer;
    }
}
//java.lang.NumberFormatException: For input string: "a"
//알파벳이 섞여있어서 numberformatexception 발생
//try-catch로 예외처리
