//세균 증식
class Solution {
    public int solution(int n, int t) {
        for(int i=1; i<=t; i++) {
            n *= 2;
        }
        //다른 풀이
        answer = n << t; //이진수 用
        return n;
    }
}
