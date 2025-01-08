public class Q02 {
	public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1)
        	return arr[index];
        return Math.max(arr[index], findMax(arr, index + 1));
    }
	public static int findMin(int[] arr, int index) {
        if (index == arr.length - 1)
        	return arr[index];
        return Math.min(arr[index], findMin(arr, index + 1));
    }

	public static void main(String[] args) {
		int[] arr = {3, 4, -1, 1};
		System.out.println("Maximum in array: " + findMax(arr, 0));
        System.out.println("Minimum in array: " + findMin(arr, 0));
	}

}
