//두 정수 사이의 합
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a<=b) {
            for(int i=a; i<=b; i++) {
            answer += i;
            }
        } else if(a>b) {
            for(int i=a; i>=b; i--) {
                answer += i;
            }
        }
      //다른 풀이
      //for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) {
      //    answer += i;
      //}
      
        return answer;
    }
}

//등차수열의 합 공식을 사용한 풀이
public long solution(int a, int b) {
  return sumAtoB(Math.min(a,b), Math.max(b,a));
}
private long sumAtoB(long a, long b) {
  return (b - a + 1) * (a + b) / 2;
}
//등차수열은 생각도 못했던 방법..
