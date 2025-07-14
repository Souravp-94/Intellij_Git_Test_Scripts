package String_Collections;

import java.util.HashMap;
import java.util.Map;

public class vowelCount {
    public static void main(String[] args) {
        String inputString = "Hello, how are you?".toLowerCase();

        Map<Character,Integer> vowels = new HashMap<>();
        vowels.put('a', 0);
        vowels.put('e', 0);
        vowels.put('i', 0);
        vowels.put('o', 0);
        vowels.put('u', 0);

        for(int i = 0 ; i < inputString.length() ; i++){
            char ch = inputString.charAt(i);
            if(vowels.containsKey(ch)){
                vowels.put(ch , vowels.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry : vowels.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}