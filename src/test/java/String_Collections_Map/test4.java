package String_Collections_Map;

import java.util.HashMap;
import java.util.Map;

public class test4 {
    public static void main(String[] args) {
        String str = "gvuygugtvtyuygyub";
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i <= ch.length -1 ; i++){
            map.put(ch[i], map.getOrDefault(ch[i] , 0)+1);
        }
        
        System.out.println(map);

        for(Map.Entry<Character, Integer> a : map.entrySet()){
            if(a.getValue() > 1){
                System.out.println(a.getKey());
            }
        }
    }
}