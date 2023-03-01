//x만큼 간격이 있는 n개의 숫자
class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long y = x;
        for(int j=0; j<n; j++) {
            answer[j] = y;
            y = y+x;
        }
        return answer;
    }
}

//배열의 첫 숫자를 지정해주고 다음 인덱스부터 x만큼 증가한 숫자를 넣어주는것도 가능.
//answer[j] = answer[j - 1] + x;
