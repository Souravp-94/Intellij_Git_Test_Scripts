package String_Collections_Map;
import java.util.*;
public class secondShortestLongestWord_group {
    public static void main(String [] args){
        String str = "My name is Sourav Kumar Padhi, i am working in softwAre software industry. I am a very honest guy. i am form pune. Previous I was is in Bhubaneswar.";
        String [] arr = str.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String s : arr){
            s = s.toLowerCase().replaceAll("[^a-zA-Z]","");
            map.put(s, s.length());
        }

        int shortest = Integer.MAX_VALUE;
        int secondShortest = Integer.MAX_VALUE;
        int longest = Integer.MIN_VALUE;
        int secondLongest = Integer.MIN_VALUE;

        for(int i : map.values()){
            if(i < shortest){
                secondShortest = shortest;
                shortest = i;
            }
            if(i < secondShortest && i > shortest){
                secondShortest = i;
            }
            if(i > longest){
                secondLongest = longest;
                longest = i;
            }
            if(i > secondLongest && i < longest){
                secondLongest = i;
            }
        }
        ArrayList<String> secondShortestWords = new ArrayList<>();
        ArrayList<String> secondLongestWords = new ArrayList<>();

        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue() == secondShortest){
                secondShortestWords.add(m.getKey());
            }
            if(m.getValue() == secondLongest){
                secondLongestWords.add(m.getKey());
            }
        }
        System.out.println("List of all second shortest words is : " + secondShortestWords);
        System.out.println("List of all second longest words is : " + secondLongestWords);
    }
}