package String_Collections_Map;

import java.util.HashMap;
import java.util.Map;

public class removeDuplicateLetters {
    public static void main(String[] args) {
       String str = "lloppt";
       StringBuilder newstr = new StringBuilder(" ");
       HashMap<Character, Integer> countLetter = new HashMap<>();
       char[] convertedArr = str.toCharArray();

       for(int i = 0 ; i <= convertedArr.length - 1 ; i++){
           countLetter.put(convertedArr[i] , countLetter.getOrDefault(convertedArr[i] , 0)+1);
       }

       for(Map.Entry<Character, Integer> enter : countLetter.entrySet()){
           if(enter.getValue() == 1){
               newstr.append(enter.getKey());
           }else{
               newstr.append(enter.getKey());
               enter.setValue(0);
           }
       }
       System.out.println(newstr);
    }
}
