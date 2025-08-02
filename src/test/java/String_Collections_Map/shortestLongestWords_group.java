package String_Collections_Map;
import java.util.*;

public class shortestLongestWords_group {
    public static void main(String[] args) {
        String sentence = "My name is Sourav Kumar Padhi, i am working in software industry. i am a very honest guy. i am form pune. Previously I was in Bhubaneswar";
        String [] arr = sentence.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String s : arr){
            s = s.toLowerCase();
            map.put(s, s.length());
        }
        int shortestLen = Integer.MAX_VALUE;
        int longestLen = Integer.MIN_VALUE;

        for(int i : map.values()){
            if(i < shortestLen){
                shortestLen = i;
            }
            if(i > longestLen){
                longestLen = i;
            }
        }
        ArrayList<String> shortestArr = new ArrayList<>();
        ArrayList<String> longestArr = new ArrayList<>();

        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue() == shortestLen){
                shortestArr.add(m.getKey());
            }
            if(m.getValue() == longestLen){
                longestArr.add(m.getKey());
            }
        }
        System.out.println("Array of all shortest words is : " + shortestArr);
        System.out.println("Array of all longest words is : " + longestArr);
    }
}