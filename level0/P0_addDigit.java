//자릿수 더하기
class Solution {
    public int solution(int n) {
        int answer = 0;
        //10으로 나누면 일의자리부터 각 자리의 자리수가 나옴
        while(n>0) {
            answer += (n%10);
            n = n/10;
        }
        return answer;
    }
}
