//평균 구하기
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double cnt = 0;
        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
            cnt++;
        }
        return answer/cnt;
    }
}

//다른 풀이
//return (int) Arrays.stream(array).average().orElse(0);
