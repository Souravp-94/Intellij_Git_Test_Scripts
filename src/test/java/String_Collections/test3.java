package String_Collections;
import java.util.HashMap;

public class test3 {
    public static void main(String[] args) {
        String str = "tftyfygyuyuyuuyuiipopppiiiqqo";
        char[] ch = str.toCharArray();
        char[] newCh;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i <= ch.length - 1 ; i++){
            map.put(ch[i], map.getOrDefault(ch[i], 0) +1);
        }
            for(int i = ch.length - 1 ; i > 0 ; i--){
                if(map.get(ch[i]) == 1){
                    System.out.print(ch[i]);
                    break;
                }
            }
    }
}