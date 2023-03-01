//하샤드 수
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int cnt = 0;
        int n = x;
        while(n>0) {
            n = n/10;
            cnt++;
        }
        n = x;
        int[] arr = new int[cnt];
        for(int i=0; i<arr.length; i++) {
            arr[i] = n%10;
            n = n/10;
        }
        cnt = 0;
        for(int i=0; i<arr.length;i++) {
            cnt += arr[i];
        }
        answer = (x%cnt==0?true:false);
        return answer;
      
      //다른 풀이
//       String[] temp = String.valueOf(x.split("");
//       int sum = 0;
//       for (String s : temp) {
//         sum += Integer.parseInt(s);
//       }
//       if(num%sum==0) {
//         return true;
//       } else {
//         return false;
//       }
      //다른 풀이
//       int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
//       return x % sum == 0;
      
    }
}

// "" 로 split하면 간단하게 풀 수 있는 문제였는데 너무 복잡하게 생각했다.

//정수의 자리수 구하기
//split해서 배열에 넣고  배열의길이로 구하기
//10으로 나눈 몫이 0보다 클때까지만 while문 돌리면서 cnt++
