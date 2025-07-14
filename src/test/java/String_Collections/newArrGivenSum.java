package String_Collections;

import java.util.ArrayList;
public class newArrGivenSum {
        public static void main(String[] args) {
            int[] arr = {10, 6, 89, 97, 1, 3};
            int targetSum = 101;
            ArrayList<Integer> result = findNumbersWithSum(arr, targetSum);

            System.out.println("Numbers that sum up to " + targetSum + ": " + result);
        }
        public static ArrayList<Integer> findNumbersWithSum(int[] arr, int targetSum) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == targetSum) {
                        result.add(arr[i]);
                        result.add(arr[j]);
                    }
                }
            }
            return result;
        }
    }

