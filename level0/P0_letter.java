//편지
class Solution {
    public int solution(String message) {
        String[] cnt = message.split("");
        int answer = (Integer)cnt.length*2;
        return answer;
        
        //다른 풀이
        //return message.length()*2;
    }
}
