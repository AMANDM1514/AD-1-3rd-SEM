public class Q02 {
    public static int linearSearch(int[] arr, int key, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return linearSearch(arr, key, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {95, 15, 58, 26, 57};
        int key = 26;
        int result = linearSearch(arr, key, 0);
        System.out.println(result != -1 ? "Key found at index: " + result : "Key not found");
    }
}
