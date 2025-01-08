public class Q01 {
    public static void BubbleSort(int arr[], int n) {
        boolean swap;
        for(int i = 0; i < n - 1; i++) {
            swap = false;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(swap == false)
                break;
        }
    }
    public static void printArray(int arr[], int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        BubbleSort(arr, n);
        System.out.print("Sorted Array: ");
        printArray(arr, n);
    }
}
