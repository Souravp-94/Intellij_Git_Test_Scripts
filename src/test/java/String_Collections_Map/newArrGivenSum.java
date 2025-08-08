package String_Collections_Map;

import java.util.*;

public class newArrGivenSum {
        public static void main(String[] args) {
            int[] arr = {10, 6, 89, 97, 13, 3,3,16,16,3};
            int targetSum = 16;
            Set<ArrayList<Integer>> result = findNumbersWithSum(arr, targetSum);

            System.out.println("Numbers that sum up to " + targetSum + ": " + result);
        }
        public static Set<ArrayList<Integer>> findNumbersWithSum(int[] arr, int targetSum) {
            Set<ArrayList<Integer>> n = new LinkedHashSet<>();
            for(int i = 0 ; i <= arr.length -1 ; i++){
                for(int j = 1 ; j <= arr.length -1 ; j++){
                    if(arr[i] + arr[j] == targetSum){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        Collections.sort(list);
                        n.add(list);
                    }
                }
            }
            return n;
        }
    }

