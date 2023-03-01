//숫자 찾기
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numstr = Integer.toString(num);
        String sk = Integer.toString(k);
        //풀이1
        String[] numarr = numstr.split("");
        for(int i=0; i<numarr.length; i++) {
            if(numarr[i].equals(sk)) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        //풀이2
        if(numstr.indexOf(sk) == -1) {
            answer = -1;
        } else {
            answer = numstr.indexOf(sk) +1;
        }
        return answer;
    }
}
//풀이1에서 조건이 맞았을 때 반복문을 탈출하게 해줘야하는데 처음엔 break를 사용하지 않아서 모든 답이 -1로 반환되었음.
//인덱스번호가 아닌 숫자의 위치를 반환해야 함 -> i+1을 반환
