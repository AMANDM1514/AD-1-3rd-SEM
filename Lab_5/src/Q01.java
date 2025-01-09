public class Q01 {
    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void arrReduction(int arr[]) {
        sort(arr);
        int count = 0;
        int red = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - red > 0) {
                System.out.print(arr.length - i + " ");
                red = arr[i];
                count++;
            }
        }
        System.out.println("\nTotal number of reductions: " + count);
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 1, 1, 2, 3, 5};
        arrReduction(arr);
    }
}
