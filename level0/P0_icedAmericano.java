//아이스아메리카노
class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
        
    }
}

// 배열을 생성하면서 값으로 바로 초기화시키는 방법도 있음.
// return new int[] { money / 5500, money % 5500 };
