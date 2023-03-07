//피자 나눠 먹기(2)
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //유클리드 호제법
        int min = (n < 6) ? n : 6;
        int gcd = 0; //최대공약수
        int lcm = 0; //최소공배수
        for(int i=1; i<=min; i++) {
            if(n%i == 0 && 6 % i == 0) {
                gcd = i;
            }
        }
        lcm = n*6/gcd;
        answer = lcm/6;
        
        //무한루프 돌리는 법
        answer = 1;
        while(true){
            if(6*answer%n==0) break;
            answer++;
        }
        
        
        return answer;
    }
}
        //최소공배수==두 수의 곱/최대공약수
        //최대공약수 -> 유클리드 호제법으로 구해야 함.
        //유클리드 호제법 : 두 수의 최대공약수를 구하는 알고리즘
        // :) 자연수 a,b에 대해서 a를 b로 나눈 나머지를 r이라고 한다면, a,b의 최대공약수와 b,r의 최대공약수는 같다.
        //ex) 60, 48의 최대공약수 : 
        //    60 % 48 = 12
        //    48 % 12 = 0  -> 최대공약수 : 12
        //최소공배수 : (60*48)/12 = 240
