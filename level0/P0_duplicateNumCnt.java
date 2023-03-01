//중복된 숫자 개수
class Solution {
    public int solution(int[] array, int n) {
        int cnt = 0;
        for(int i=0; i<array.length;i++) {
            if(array[i] == n) {
                cnt++;
            }
        }
        //다른 방법
        //for (int num : array) {
        //  if(num == n) cnt++;
        //}
        return cnt;
    }
}
