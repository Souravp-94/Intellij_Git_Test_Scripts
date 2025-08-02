package String_Collections_Map;
import java.util.*;
public class groupAnagramWords {
    public static void main(String[] args){
        String [] arr = {"apt","pat","tap","tank","friend","firEd","fried","kanT"};
        Map<String, ArrayList<String>> map = new LinkedHashMap<>();
        for(String s : arr){
            char [] c = s.toLowerCase().toCharArray();
            Arrays.sort(c);
            String word = new String(c);
            map.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
        }
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for(ArrayList<String> a : map.values()){
            if(a.size() > 1){
                list.add(a);
            }
        }
        System.out.println("Anagram groups are : "+list);
    }
}