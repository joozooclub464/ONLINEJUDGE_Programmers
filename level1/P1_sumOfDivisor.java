//약수의 합
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                answer += i;
            }
        }
        return answer;
    }
}

//다른 사람이 num/2까지만 for문을 돌리고 마지막에 answer+num을 해준 코드를 보았다.
//효율적인 코드. 노력할것.
