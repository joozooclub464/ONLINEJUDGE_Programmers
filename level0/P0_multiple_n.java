//n의 배수 고르기
class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int cnt = 0;
        int[] arr = new int[numlist.length];
        
        for(int i=0;i<numlist.length; i++) {
            if(numlist[i]%n==0) {
                //n의 배수일때
                arr[cnt] = numlist[i];
                cnt++;
            }
        }
        int answer[] = new int[cnt];
        for(int i=0;i<cnt;i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}
