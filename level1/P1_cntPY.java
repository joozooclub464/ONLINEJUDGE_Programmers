//문자열 내 p와 y의 개수
class Solution {
    boolean solution(String s) {
        int pcnt = 0;
        int ycnt = 0;
        char[] str = s.toCharArray();
        for(int i=0; i<str.length; i++) {
            if(str[i] == 'p' || str[i] == 'P') {
                pcnt++;
            } else if(str[i] == 'y' || str[i] == 'Y'){
                ycnt++;
            }
        }
        if(pcnt == ycnt) {
            return true;
        } else {
            return false;
        }
        
    }
}

//cnt변수 하나만 선언한 아래 코드를 보았다. 생각 못했던 방법
s = s.toLowerCase();
int count = 0;

for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == 'p')
        count++;
    else if (s.charAt(i) == 'y')
        count--;
}

if (count == 0)
    return true;
else
   return false;
}
