//배열 회전시키기
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")) {
            for(int i=0; i<numbers.length; i++) {
                if(i==numbers.length-1) {
                    answer[0] = numbers[i];
                } else {
                    answer[i+1] = numbers[i];
                }
            }
        } else if(direction.equals("left")) {
            for(int i=0; i<numbers.length; i++) {
                if(i==0) {
                    answer[numbers.length-1] = numbers[i];
                } else {
                    answer[i-1] = numbers[i];    
                }    
            } 
        }
        return answer;
        
        //다른 풀이
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}

//인덱스가 0부터 시작하는데 계속 numbers.length 로 넣어서 arrayIndexOutOfBoundsException발생..
