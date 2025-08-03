package String_Collections_Map;
import java.util.*;
public class secondShortestWord {

    public static void main(String[] args){
        String[] arr = {"i","am","sourav","is"};
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String s : arr){
            map.put(s, s.length());
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i : map.values()){
            if(i < smallest){
                secondSmallest = smallest;
                smallest = i;
            }
            if(i < secondSmallest && i > smallest){
                secondSmallest = i;
            }
        }

        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue() == secondSmallest){
                System.out.println("Second smallest word is : " + m.getKey());
            }
        }
    }
}