//약수 구하기
class Solution {
    public int[] solution(int n) {
        int[] arrdiv = new int [10000];
        int cnt = 0;
        //약수 : 나눴을 때 나머지가 0인 수
        for(int i=1;i<=n; i++) {
            if((n%i)==0) {
                arrdiv[cnt] = i;
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for(int i=0; i<cnt; i++) {
            if(arrdiv[i] != 0) {
                answer[i] = arrdiv[i];
            }
        }
        return answer;
    }
}
//int형 배열에 int값을 넣으려고 해서 계속 에러가 났음.
//n의 값이 최대 10,000이기 때문에 약수를 저장하는 배열의 크기를 10000으로 선언함.
//약수를 구하는 과정에서 구한 cnt로 answer배열의 크기를 설정한 후 arrdiv의 값을 answer값에 복사해줌
