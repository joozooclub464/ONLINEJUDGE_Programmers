//배열의 평균값
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i=0;i<numbers.length;i++) {
            answer+=numbers[i];
        }
        answer = answer/numbers.length;
        return answer;
    }
}

//다른 정답-> stream用
//Arrays.stream(numbers).average().orElse(0);
