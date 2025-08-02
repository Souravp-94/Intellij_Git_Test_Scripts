package String_Collections_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class shortestLongestWord {
    public static void main(String[] args) {
        String sentence = "My name is Sourav Kumar Padhi, i am working in software industry. i am a very honest guy. i am form pune. Previously I was in Bhubaneswar";
        String [] str = sentence.split(" ");

        String shortest = str[0];
        String longest = str[0];

        for(String s : str){
            s = s.toLowerCase().replaceAll("[^a-zA-Z]","");
            if(s.isEmpty()){
                continue;
            }
            if(s.length() < shortest.length()){
                shortest = s;
            }
            if(s.length() > longest.length()){
                longest = s;
            }
        }
        System.out.println("The shortest word in the given sentence is : "+shortest);
        System.out.println("The longest word in the given sentence is : "+longest);
    }
}