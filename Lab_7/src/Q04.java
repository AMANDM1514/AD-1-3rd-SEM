import java.util.Arrays;

public class Q04 {
    public static void findMinMaxDifference(int[] arr) {
        Arrays.sort(arr);

        // Minimum difference
        int minDiff = Integer.MAX_VALUE;
        int minPairA = -1, minPairB = -1;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
                minPairA = arr[i - 1];
                minPairB = arr[i];
            }
        }

        // Maximum difference
        int maxDiff = arr[arr.length - 1] - arr[0];
        int maxPairA = arr[0];
        int maxPairB = arr[arr.length - 1];

        System.out.println("Minimum difference pair: (" + minPairA + ", " + minPairB + ") with difference: " + minDiff);
        System.out.println("Maximum difference pair: (" + maxPairA + ", " + maxPairB + ") with difference: " + maxDiff);
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 15, 2, 25, 6};
        findMinMaxDifference(arr);
    }
}
