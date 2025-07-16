package String_Collections_Map;

public class reverseEachLetterOfString {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }

        // Convert character array back to string
        return new String(charArray);
    }
}
