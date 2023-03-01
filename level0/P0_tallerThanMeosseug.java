//머쓱이보다 키 큰 사람
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int num : array) {
            if(num > height) answer++;
        }
        return answer;
    }
}
