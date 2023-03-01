//순서쌍의 개수
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                answer++;
            }
        }
        return answer;
    }
}
//다른 풀이
//return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();

//range : 
//rangeClosed(,)
