//주사위의 개수
class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int i=0;i<box.length;i++) {
            answer *= (box[i]/n);
        }
        return answer;
        //한줄로
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
    }
}
//전체 box의 부피를 구하고 거기서 주사위의 부피를 나눠주려 했었음.
//주사위를 지점토마냥 뭉갤수가 없는데..왜 저렇게 생각했지...ㅎ
