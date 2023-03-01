//콜라츠 추측
class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt = 0;
        if(num==1) {
            answer = 0;
        } else {
            while(num!=1) {
                if(num%2==0) {
                    num = num/2;
                } else  {
                    num = num*3+1;
                }
                cnt++;
            }
            answer = (cnt>=500?-1:cnt);
        }
        return answer;
    }
}
//while문 조건을 num!=1로 해줘야 num이 1일때 반복문을 탈출함(착각해서 조금 헤맸다..)
//테스트케이스3에서 int형으로 하면 스텍오버플로우 발생. 자료형을 long으로 바꿔주기
