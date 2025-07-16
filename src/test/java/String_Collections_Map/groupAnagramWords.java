package String_Collections_Map;

import java.util.ArrayList;
import java.util.*;

public class groupAnagramWords {
    public static List<List<String>> anagramWords (String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toLowerCase().toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            map.computeIfAbsent(str,k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String [] strArr = {"Bat","Tab","tap","Pat","fried","FiRed","like","tOp","POT"};
        System.out.println(anagramWords(strArr));
    }
}