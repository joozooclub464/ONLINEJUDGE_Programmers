//짝수는 싫어요
class Solution {
    public int[] solution(int n) {
        int[] answer;
        int a = 0;
        if(n%2==0) {
            answer = new int[n/2];
        } else {
            answer = new int[n/2+1];
        }
        
        for(int i=1; i<=n; i++) {
            if(i%2 == 1) {
                answer[a] = i;
                a++;
            }    
        }
     
        //다른풀이
        //return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
        
        return answer;
    }
}
//answer배열을 먼저 선언해주고 조건문에서 초기화를 해주면 되는데 조건문 안에서 선언과 초기화를 동시에 진행했더니 전역변수가 아니라서 에러가 났음.
//for문 안에서 answer배열을 돌면서 i값을 넣어주려고 했었는데 내가 짠 코드대로라면 두번쨰 for문을 다 돌아야 탈출할 수 있어서 
//answer에 계속 마지막 홀수값으로 도배가 되는 문제가 발생함.
//a를 선언해주고 인덱스로 사용하니 해결됨.
//스트림을 사용하여 간단하게 해결한 다른사람 풀이를 보았음..스트림...잘 쓰고싶다...다시 공부해야겠다.
