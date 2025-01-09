public class Q03 {
    public static boolean checkReverse(int arr[], int n) {
        if (n == 1) 
            return true;
        int i;
        for (i = 1; i < n && arr[i - 1] < arr[i]; i++);
        if (i == n) 
            return true;
        
        int j = i;
        while (j < n && arr[j] < arr[j - 1]) {
            j++;
        }
        if (j == n) 
            return true; 
        int k = j;
        while (k < n && arr[k] >= arr[k - 1]) {
            k++;
        }
        return k == n;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 10, 9, 11, 2};
        int n = arr.length;
        if (checkReverse(arr, n))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
