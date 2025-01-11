public class Q03 {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = 8;
        System.out.println("Missing number: " + findMissingNumber(arr, n));
    }
}
