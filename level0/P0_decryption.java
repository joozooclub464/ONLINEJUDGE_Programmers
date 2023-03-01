//암호 해독
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length(); i+=code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}
//for문의 범위를 cipher.length()와 작거나 같다로 줬더니 테스트케이스에서는 모두 통과되었지만
//제출하니 계속해서 런타임에러 발생함.
//혹시 다른 제한사항때문에 에러가 발생한건가 싶어서 테스트케이스를 추가해봤지만 이상없음.
//for문 범위를 잘 정해주자..
