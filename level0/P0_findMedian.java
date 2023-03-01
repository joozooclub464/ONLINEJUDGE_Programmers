//중앙값 구하기
import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}

//array.length >> 1
//시프트 연산으로 나누기 2를 한 코드를 보았다.
//생각못한방법
