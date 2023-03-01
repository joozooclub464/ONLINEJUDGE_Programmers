//배열 자르기
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = numbers[num1+i];
        }
        return answer;
    }

  // 다른 풀이
  // return Arrays.copyOfRange(numbers, num1, num2 + 1);
  // Arrays의 copyOfRange메서드를 활용하면 한 줄로 가능한데 나는 for문으로 배열복사를 했다.
  
  // Arrays.copyOf(복사할 배열, 복사할 배열의 크기);
  // Arrays.copyOfRange(복사하고자 하는 배열, 시작위치, 배열크기);
