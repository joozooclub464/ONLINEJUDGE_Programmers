//인덱스 바꾸기
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String s1 = my_string.substring(num1,num1+1);//e
        String s2 = my_string.substring(num2,num2+1);//l
        
        StringBuilder sb = new StringBuilder(my_string);
        System.out.print(s2);
        sb.setCharAt(num2, s1.charAt(0));
        sb.setCharAt(num1, s2.charAt(0));
        
        return answer = sb.toString();
      
      //스트림 사용한 풀이
      List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

      Collections.swap(list, num1, num2);
      return String.join("", list);
    }
}
//stringbuilder.setCharAt(바꿀위치인덱스, 'char값')  : 인덱스 위치에 있는 글자를 char값으로 교체한다.
//단 위의 setCharAt()을 사용하려면 문자열의 타입이 String이 아닌 StringBuilder타입이어야 함.
//바꾸려는 문자열을 추출할 떄 substring 用 추출함 -> setCharAt 用 -> 타입에러 발생(string타입은 넣을 수 없어서..)
//고민하다가 str.charAt(0) 사용해서 char타입으로 바꿔줬는데 애초에 char타입의 배열을 만들어서 toCharArray() 쓰는게 더 나았을수도..(그냥 배열 안 쓰고 해보고싶었..ㅎ)

//스트림을 잘 쓰고 싶은데 아직은 어렵다..
//그리구..오늘은 3.1절!
