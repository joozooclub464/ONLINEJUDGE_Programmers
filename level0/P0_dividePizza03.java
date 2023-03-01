//피자 나눠 먹기3
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        return answer = n%slice==0? n/slice : n/slice+1;
    }
}
