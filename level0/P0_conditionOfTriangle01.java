//삼각형의 완성조건(1)
import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        return answer = sides[0]+sides[1]>sides[2]? 1 : 2 ;
        
    }
}
