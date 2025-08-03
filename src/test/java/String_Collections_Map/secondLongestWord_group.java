package String_Collections_Map;
import java.util.*;
public class secondLongestWord_group {

    public static void main(String[] args){
        String str = "My name is Sourav Kumar Padhi, i am working in software industry. I am a very honest guy. i am form pune. Previous I was in Bhubaneswar.";
        String[] arr = str.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String s : arr){
            s = s.toLowerCase().replaceAll("[^a-zA-Z]","");
            map.put(s, s.length());
        }
        int longest = Integer.MIN_VALUE;
        int secondLongest = Integer.MIN_VALUE;
        for(int i : map.values()){
            if(i > longest){
                secondLongest = longest;
                longest = i;
            }
            if(i > secondLongest && i < longest){
                secondLongest = i;
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue() == secondLongest){
                list.add(m.getKey());
            }
        }
        System.out.println("List of all second longest word/s are : " + list);
    }
}