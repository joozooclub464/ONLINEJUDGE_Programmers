//자연수 뒤집기
import java.util.*;
class Solution {
    public int[] solution(long n) {
      
      //풀이 1
      int[] answer = new int[(int)(Math.log10(n)+1)];
      int i = 0;
        
      while(true) {
          answer[i] = (int)(n%10);
          if(n<10) {
              break;
          }
          n = n/10;
          i++;
      }
      
      //풀이 2
      String sn = String.valueOf(n);
      StringBuilder sb = new StringBuilder(sn);
        
      sb = sb.reverse();
      String[] strans = sb.toString().split("");
      int[] answer = new int[strans.length];
      
      for(int i=0; i<answer.length; i++) {
          answer[i] = Integer.parseInt(strans[i]);
      }
      //다른 풀이
      //return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
      return answer;
    }
}
//처음에는 while문 사용하여 10으로 나눈 나머지를 answer배열에 넣는 방법을 사용했으나 잘 되지 않았고,
//풀이2 대로 입력값을 String으로 바꿔서 StringBuilder를 사용한 reverse를 하고 그것을 다시 배열에 넣는 방법으로 했었는데
//알고보니 풀이1 에서 break문 조건을 잘못 줘서 ArrayIndexOutOfBoundsException가 발생했던 것...

// int형 숫자 자릿수 구하기
// (int)(Math.log10(num)+1)
