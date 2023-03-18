//k의 개수
class Solution {
    public int solution(int i, int j, int k) {
        String str = "";
        String sk = Integer.toString(k);
        for(int a=i; a<=j; a++) {
            str += a;
        }
        return str.length() - str.replace(sk,"").length();
    }
}
