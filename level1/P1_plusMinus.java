//음양 더하기
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int j=0; j<absolutes.length; j++) {
            if(signs[j]) {
                answer += absolutes[j];
            } else {
                answer -= absolutes[j];
            }
        }
      //다른풀이1
      for (int i=0; i<signs.length; i++){
            answer += absolutes[i] * (signs[i]? 1: -1);
      }
      //다른풀이2
      answer += (signs[i]) ? absolutes[i] : -absolutes[i];
      
        return answer;
    }
}
