//특정 문자 제거하기
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] mystr = my_string.split("");
        
        for(int i=0; i<mystr.length; i++) {
            if(!mystr[i].equals(letter)){
                answer += mystr[i];
            }
        }
        return answer;
      //다른풀이
      //return my_string.replace(letter, "");
    }
}
//처음에 toCharArray() 를 사용하여char타입의 배열에 넣고 값을 비교하려고 하니 
//letter 객체와 타입이 맞지 않아서 직접 비교가 불가했다.
//그래서 그냥 split사용하여 String타입으로 비교했음.

//문자열 치환 함수
//Replace, ReplaceAll, ReplaceFirst
//string.replace("기존문자","바꿀문자"); : 자신이 바꾸고 싶은 문자로 문자열을 치환시켜줌 (특수문자로도 치환 可)
//string.replaceAll("정규식","바꿀문자"); : 자신이 바꾸고 싶은 문자로 문자열을 전부 치환시켜줌 (특수문자 不)
//string.replaceFirst("기존문자","바꿀문자"); : 자신이 바꾸고 싶은 문자열이 처음으로 해당할 때에만 치환시켜줌
