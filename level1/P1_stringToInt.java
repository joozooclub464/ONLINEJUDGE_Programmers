//문자열을 정수로 바꾸기
class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.substring(0).equals('+')) {
            answer = Integer.parseInt(s);
        } else {
            answer = '-';
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}

//부호도 변환이 됨 -> s를 통쨰로  int타입으로 형변환 바로 해도 됨. (answer에 s를 넣고 바로 Integer.parseInt(answer)를 리턴해줌)

//다른 풀이
//Integer.parseInt()를 쓰지 않고 푼 코드를 봤음
boolean Sign = true;
int result = 0;
for(int i=0; i<str.length(); i++) {
  char ch = str.chasAt(i);
  if(ch == '-')
    Sign = false;
  else if(ch != '+')
    result = result * 10 + (ch - '0');
}
return Sign?1:-1 * result;
}
//문자형(char)을 사칙연산 할 때는 각 문자에 부여된 유니코드값으로(ex 0은 유니코드로 48) 연산이 되고 숫자가 커질 떄 마다 유니코드 값도 1씩 커기지 때문에 
//숫자가 담긴 문자형끼리 뺼셈을 하면 실제 숫자로 계산했을때와 같은 값이 나옴.
