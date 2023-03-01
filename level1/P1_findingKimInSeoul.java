//서울에서 김서방 찾기
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int loc = 0;
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                loc = i;
            }
        }
        answer = "김서방은 " + loc + "에 있다";
        return answer;
    }
}
//equals : 대소문자 구분함
//equalsIgnoreCase : 대소문자 구분 안함
