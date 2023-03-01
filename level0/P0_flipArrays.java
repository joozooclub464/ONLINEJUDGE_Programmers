//배열 뒤집기
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<=num_list.length-1; i++) {
            answer[i] = num_list[num_list.length-1-i];
        }
    
        return answer;
    }
}
//계속 오류가 났던 이유
//for문의 조건식에서 범위 지정을 잘못했음. num_list.length-1보다 작거나 같아야 하는데
//작을때 로 조건을 줘서 계속 마지막 인덱스의 값이 0으로 들어갔음.
