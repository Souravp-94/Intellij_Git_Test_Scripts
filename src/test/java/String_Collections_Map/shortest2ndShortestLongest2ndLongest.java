package String_Collections_Map;
import java.util.*;

public class shortest2ndShortestLongest2ndLongest {
    public static void main(String[] args) {
        String str = "In 2001, Indian cricket faced one of its darkest moments when Sachin Tendulkar, the God of Cricket, was shockingly accused of ball tampering during a Test match against South Africa in Port Elizabeth. The visuals showed nothing but Sachin cleaning the seam, yet match referee Mike Denness shamelesss labeled him a cheater —without solid proof, without umpires' consultation.";

        String [] s = str.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String st : s){
            st = st.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
            map.put(st, st.length());
        }
        System.out.println(map);

        int shortest = Integer.MAX_VALUE;
        int secondShortest = Integer.MAX_VALUE;
        int longest = Integer.MIN_VALUE;
        int secondLongest = Integer.MIN_VALUE;

        for(int i : map.values()){
            if(i < shortest){
                secondShortest = shortest;
                shortest = i;
            }
            if(i > shortest && i < secondShortest){
                secondShortest = i;
            }
            if(i > longest){
                secondLongest = longest;
                longest = i;
            }
            if(i < longest && i > secondLongest){
                secondLongest = i;
            }
        }
        System.out.println(shortest + " " +secondShortest+ " " +longest+ " " +secondLongest);

        ArrayList<String> shortestArr = new ArrayList<>();
        ArrayList<String> secondShortestArr = new ArrayList<>();
        ArrayList<String> longestArr = new ArrayList<>();
        ArrayList<String> secondLongestArr = new ArrayList<>();

        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue().equals(shortest)){
                shortestArr.add(m.getKey());
            }
            if(m.getValue().equals(secondShortest)){
                secondShortestArr.add(m.getKey());
            }
            if(m.getValue().equals(longest)){
                longestArr.add(m.getKey());
            }
            if(m.getValue().equals(secondLongest)){
                secondLongestArr.add(m.getKey());
            }
        }
        System.out.println("smallest words : "+shortestArr);
        System.out.println("second smallest words : "+secondShortestArr);
        System.out.println("longest words : "+longestArr);
        System.out.println("second longest words : "+secondLongestArr);
    }
}