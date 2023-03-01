//문자열 안에 문자열
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
        //삼항연산자用
        return str1.contains(str2)?1:2;
    }
}
//contains() 함수
//대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
//대소문자 구분
