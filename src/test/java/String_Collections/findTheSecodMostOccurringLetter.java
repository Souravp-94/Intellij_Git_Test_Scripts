package String_Collections;

import java.util.HashMap;

public class findTheSecodMostOccurringLetter {
    public static void main(String[] Args){
        String str = "ab".toLowerCase();
        HashMap<Character, Integer> wordMap = new HashMap<>();
        char[] wordArray = str.toCharArray();

        for(int i = 0 ; i <= wordArray.length - 1 ; i++){
            if(wordArray[i] != ' '){
                wordMap.put(wordArray[i] , wordMap.getOrDefault(wordArray[i], 0) + 1 );
            }
        }
        System.out.println("The frequency of all words is : " + wordMap);

        int mostOccuringNum = 0;
        int secondMostOccuringNum = 0;

        for(int freq : wordMap.values()){
            if(freq > mostOccuringNum){
                secondMostOccuringNum = mostOccuringNum;
                mostOccuringNum = freq;
            }
            if(freq > secondMostOccuringNum && freq < mostOccuringNum){
                secondMostOccuringNum = freq;
            }
        }
        System.out.println("The second most occurring frequency is : " + secondMostOccuringNum);

        if(secondMostOccuringNum != 0) {
            for (char ch : wordMap.keySet()) {
                if (wordMap.get(ch) == secondMostOccuringNum) {
                    System.out.println("The second most occurring letter is/are : " + ch);
                }
            }
        }else{
            System.out.println("Their is no second highest occurring letter in the string");
        }

    }
}
