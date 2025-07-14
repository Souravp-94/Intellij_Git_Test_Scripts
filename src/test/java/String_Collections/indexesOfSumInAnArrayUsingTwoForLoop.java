package String_Collections;

import java.util.Arrays;

public class indexesOfSumInAnArrayUsingTwoForLoop {
    public static void main(String[] Args){
        int[] intSet = {3, 9, 0, 6, 8, 1};
        int target = 9;

        int start = 0;
        int end = 1;
        boolean found = false;

        for (int i = 0; i < intSet.length; i++) {
            int sum = intSet[start] + intSet[end];

            if (sum == target) {
                System.out.println("Indexes: " + start + ", " + end);
                found = true;
                break;
            } else if (end < intSet.length - 1) {
                end++;
            } else {
                start++;
                end = start + 1;
            }
        }

        if (!found) {
            System.out.println("No such pair found.");
        }
    }
}
