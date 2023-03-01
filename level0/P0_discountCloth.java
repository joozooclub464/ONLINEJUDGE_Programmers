//옷가게 할인 받기
class Solution {
    public double solution(double price) {
        double answer = 0;
        if(price>=500000) {
            answer = price*0.8;
        } else if(price>=300000) {
            answer = price*0.9;
        } else if(price>=100000) {
            answer = price*0.95;
        } else {
            answer = price;
        }
        
        return Math.floor(answer);
    }
}

//테스트케이스 13,14에서 계속 에러가 남
//소수점 아래를 버리도록 하니 해결됨.
//그냥 int로 형변환 해도 됐겠지만 이렇게 해 보고 싶었음..

//Math.ceil() : 소수점 올림. 정수 반환
//Math.floor() : 소수점 버림. 정수 반환
//Math.round() : 소수점 반올림. 정수 반환
