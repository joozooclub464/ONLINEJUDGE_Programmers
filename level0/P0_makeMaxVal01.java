//최댓값 만들기(1)
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int tmp = 0;
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[j]>numbers[i]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        return answer = numbers[0]*numbers[1];
        
        //다른풀이
        // Arrays.sort(numbers);
        // return answer = numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}
//Arrays.sort(배열); : 오름차순 정렬
//Arrays.sort(배열, Collections.reverseOrder()); : 내림차순 정렬
//                                              -> int형의 배열은 객체가 아닌 기본형타입(primitive type)으로 인식하기 때문에 Integer[] 배열로 바꾼 후 내림차순 정렬 해줘야 함. 
