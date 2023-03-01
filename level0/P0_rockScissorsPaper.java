//가위 바위 보
class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] ch = new char[rsp.length()];
        for(int i=0; i<rsp.length(); i++) {
            ch[i] = rsp.charAt(i);
        }
        for(int i=0; i<ch.length; i++) {
            if(ch[i]=='2') {
                answer += 0;
            } else if(ch[i]=='0') {
                answer += 5;
            } else {
                answer += 2;
            }
        }
        return answer;
    }
}
//숫자 자동형변환이 되는줄알고 그냥 넣었다가 모든 값이 else문으로만 들어가는 문제 발생
//char배열을 char와 비교하는것으로 수정했더니 정상작동함.
//switch문도 사용 가능한데 그걸 쓸 생각을 못했음
