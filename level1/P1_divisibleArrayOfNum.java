//나누어 떨어지는 숫자 배열
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        Arrays.sort(arr);
        List<Integer> arrlist = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                arrlist.add(arr[i]);
            }
        }
        if(arrlist.size()<1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arrlist.size()];
            for(int i=0;i<answer.length;i++) {
                answer[i] = arrlist.get(i);
            }
        }
      //다른 풀이
      //int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
      //if(answer.length == 0) answer = new int[] {-1};
      //java.util.Arrays.sort(answer);
      //return answer;
      
        return answer;
    }
}
//string에 텍스트로 더하고 toCharArray를 쓰니 두자리수 숫자를 1과 0으로 분리하는 문제 생김
//나누어 떨어지는 수를 List에 추가하고, arrlist의 길이에 따라 배열을 다르게 선언하여 리턴하는 방법을 썼음.

//스트림과 람다를 사용한 다른 풀이 有



