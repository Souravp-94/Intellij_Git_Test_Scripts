package String_Collections;

public class reverseWordOfTheString {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseWords(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        String reversedString = "";
        for (String word : words) {
            String reversedWord = reverseString(word);
            reversedString += reversedWord + " ";
        }
        return reverseString(reversedString.trim());
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
