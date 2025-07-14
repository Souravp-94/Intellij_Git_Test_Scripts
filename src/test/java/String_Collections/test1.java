package String_Collections;

import java.util.HashMap;

public class test1 {
    public static void main(String[] args) {
        String str = "My name is Sourav Kumar Padhi";//a,y,m
        test(str);
    }

    public static void test(String str){
        str = str.toLowerCase();
        for(int i = 0 ; i < str.length() ; i++){

            int count = 0;

            for(int j = i ; j <= i ; j++){
                char ch = str.charAt(i);
                HashMap<Character,Integer> map = new HashMap<Character,Integer>();

                if (map.isEmpty()){
                    count++;
                    map.put(ch,count);
                }
                else{
                    if(map.get(ch) != 0){
                        count = map.get(ch)+1;
                        map.put(ch,count);
                    }
                    else {
                        count++;
                        map.put(ch,count);
                    }
                }
                System.out.println(map);
            }

        }

    }
}
