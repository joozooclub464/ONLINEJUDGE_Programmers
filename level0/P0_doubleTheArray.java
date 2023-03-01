//배열 두 배 만들기
import java.util.*;
class Solution {
    public ArrayList solution(int[] numbers) {
    // public int[] solution(int[] numbers) {
        //for문 用
        // int[] answer = new int[numbers.length];
        // for(int i=0; i<numbers.length; i++) {
        //     answer[i] = numbers[i]*2;
        // }
        
        //향상된 for문 用
        ArrayList<Integer> answer = new ArrayList<>();

        for(int num : numbers){
            answer.add(num*2);
        }
        
        return answer;
    }
}
