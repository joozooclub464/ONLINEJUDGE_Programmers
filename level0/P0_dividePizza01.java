//피자 나눠 먹기(1)
class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = n%7==0 ? n/7 : n/7+1;
      
        // if(n%7==0) {
        //     answer = n/7;
        // } else {
        //     answer = n/7+1;
        // }
        return answer;
    }
}
