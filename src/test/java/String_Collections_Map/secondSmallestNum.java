package String_Collections_Map;
import java.util.HashMap;

public class secondSmallestNum {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i : arr){
            if(i < smallest){
                secondSmallest = smallest;
                smallest = i;
            }
            if(i < secondSmallest && i > smallest){
                secondSmallest = i ;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            throw new RuntimeException("No second smallest element found (array may contain all same elements).");
        }

        System.out.println(secondSmallest);
    }
}