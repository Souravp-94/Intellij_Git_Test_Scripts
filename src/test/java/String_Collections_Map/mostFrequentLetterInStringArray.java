package String_Collections_Map;

import java.util.*;

public class mostFrequentLetterInStringArray {
    public static void main(String[] args) {
        String[] st = {"teeth", "elEphant", "Window", "rabbit", "liLly", "yellow", "telephone", "India", "ParROt"};
        charExtractor(st);
    }
    public static void charExtractor(String [] st){
        for(String s : st){
            char[] ch = s.toLowerCase().toCharArray();
            HashMap<Character, Integer> map = new LinkedHashMap<>();

            for(char c : ch){
                map.put(c, map.getOrDefault(c, 0)+1);
            }

            int mostFrequentLetterNum  = Integer.MIN_VALUE;
            for(int i : map.values()){
                if(i > mostFrequentLetterNum){
                    mostFrequentLetterNum = i;
                }
            }

            ArrayList<Character> mostFrequentLetterNumArr = new ArrayList<>();
            for(Map.Entry<Character, Integer> e : map.entrySet()){
                if(e.getValue() == mostFrequentLetterNum){
                    mostFrequentLetterNumArr.add(e.getKey());
                }
            }

            System.out.println("For the word '" + s + "' " + mostFrequentLetterNumArr + " is/are the letter/s with highest frequency.");
        }
    }
}
