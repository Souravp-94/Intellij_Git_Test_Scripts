package String_Collections;

public class reverseEachWord {
    public static void main (String[] Args){
        String str = "My nAme Is SOUrav kUMar padHI".toLowerCase();
        String[] strWord = str.split(" ");
        String newStr = "";

        for(int i = strWord.length - 1 ; i >= 0 ; i--){
            char[] word = strWord[i].toCharArray();
            String revWord = "";
            for(int j = word.length - 1 ; j >= 0 ; j--){
                revWord += word[j];
            }
            System.out.println(revWord);
            newStr += revWord + " ";
        }
        System.out.println(newStr);
    }

}
