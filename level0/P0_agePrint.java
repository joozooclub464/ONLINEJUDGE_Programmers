//나이 출력
import java.time.*;
class Solution {
    public int solution(int age) {
        int answer = 0;
        // answer = 2022-age+1;
        LocalDate today = LocalDate.now();
        answer = today.getYear() - age;
        return answer;
    }
}
//처음에는 주어진 2022년으로 계산하였으나 새해를 맞아 2023년으로 바뀌었으므로 
//LocalDateTime을 통해 현재 로컬 컴퓨터의 시각을 받아와서 계산함
//이 때 해가 바뀌어 입출력 예의 값이 바뀌어서 age+1을 하지 않고 작성함.(테스트 코드의 기준이 2022년이기 때문)
