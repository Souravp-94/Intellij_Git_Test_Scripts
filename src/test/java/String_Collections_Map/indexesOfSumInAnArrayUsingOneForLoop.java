package String_Collections_Map;

public class indexesOfSumInAnArrayUsingOneForLoop {
    public static void main(String[] Args) {
        int[] intSet = {3, 9, 0, 6, 8, 1};
        int target = 9;

        for (int i = 0; i < intSet.length; i++) {
            for (int j = i + 1; j < intSet.length; j++) {
                if (intSet[i] + intSet[j] == target) {
                    System.out.println("Indexes: " + i + ", " + j);
                }
            }
        }
    }
}
