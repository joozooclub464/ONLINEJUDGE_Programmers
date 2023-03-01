//제일 작은 수 제거하기
import java.util.*;
class Solution {
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
            .filter(i -> i != item)
            .toArray();
    }
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] ans = {};
        int item = 0;
        int min = Arrays.stream(arr).min().getAsInt();
        
        if(arr.length<2) {
            ans = new int[1];
            ans[0] = -1;
        } else {
            answer = new int[arr.length]; 
            for(int i=0; i<arr.length; i++) {
                if(arr[i] > min) {
                    answer[i] = arr[i];
                }
            }
            answer = removeElement(answer,item);
            ans = new int[answer.length];
            for(int i=0; i<ans.length; i++) {
                ans[i] = answer[i];
            }
        }
        return ans;
    }
}
//Arrays.sort(strArray, Comparator.reverseOrder()); // 내림차순
//단 Object타입의 배열만 用可 기본타입인 int,double,char,float는 不
//기본타입의 배열을 Object를 상속하는 Wrapper클래스로 박싱해주어야함.

//계속 첫번째 테스트케이스가 틀렸다고 나옴. 질문목록을 찾다보니 sort하라는 조건은 없는데 공교롭게도 테스트케이스가 정렬되어있는 상태라서 다들 혼동이 온 듯(나만 그런게 아니여~~)
//정렬 조건을 빼고 하면 된다는 말이 있어서 해봄.
//처음에 아무 생각 없이 중첩for문 써서 새로운 배열에 값을 넣었는데 가만 보니 맨 마지막 값으로 덮어씌워지는 문제 발생(바보야~~)
//최소값이 가운데에 주어진 경우 answer배열 중간에 값이 안 들어가서(0값이 중간에 낑김) 최소값을 제외한 값이 제대로 출력되지 않는 문제가 생김.
//streamAPI를 사용하여 Array에서 요소를 제거하는 방법을 구글링해서 풀었다...(array를 순차스트림으로 변환하고 스트림을 필터링해서 주어진 요소를 제거하고 나머지 요소를 새 array로 누적하는 방법)
//갈 길이 멀다...
