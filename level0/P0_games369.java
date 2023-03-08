//369게임
class Solution {
    public int solution(int order) {
        int answer = 0;
        //int형인 order를 문자열로 변환해서 구함
        String ors = Integer.toString(order); //order를 문자열로 변환
        int[] ornum = new int[ors.length()]; //int형 배열 ornum을 선언함
        for(int i=0; i<ornum.length; i++) { 
            ornum[i] = ors.charAt(i)-'0'; 
            //str.charAt(i) : 숫자가 아닌 문자가 출력됨
            //ex) str.charAt(0) -> 문자 '1'이 출력됨.
            //출력된 문자를 숫자로 바꾸기 -> char형의 문자'1'을 int형으로 형변환 하면 아스키코드 값(49)으로 반환
            //우리가 필요한 값은 1 -> 49에서 1이 되기 위해서는 -48을 해줘야 함
            //==>  -'0' 을 해주는 것('0'의 아스키코드 == 48)
        }
        for(int i=0; i<ornum.length; i++) {
            if(ornum[i]==3 || ornum[i]==6 || ornum[i]==9) {
                answer++;
            }
        }
        return answer;
    }
}
