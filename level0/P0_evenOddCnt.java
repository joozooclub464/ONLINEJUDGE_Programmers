//짝수 홀수 개수
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for(int i=0;i<num_list.length;i++) {
            if(num_list[i]%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        // //다른 풀이
        // for(int i = 0; i < num_list.length; i++){
        //     answer[num_list[i] % 2]++;
        // }
        //짝수는 %2가 0인 값인데 짝수의 값이 answer배열의 0번째 인덱스에 저장되기 때문에 이것을 한 줄로 쓴 코드를 보았다...
        //천잰가..? 불필요한 변수 선언을 줄이자..
        return answer;
    }

}
        
