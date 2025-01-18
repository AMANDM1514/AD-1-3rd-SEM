import java.util.Arrays;
public class Q03 {
	public static void reverseArray(int arr[], int start, int end){
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void rotateArray(int arr[], int d) {
		int n = arr.length;
		d %= n;
		reverseArray(arr, 0, n-1);
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int d = 3;
		System.out.print("Original Array: "+Arrays.toString(arr));
		rotateArray(arr, d);
		System.out.print("\nArray after rotation: "+Arrays.toString(arr));
	}
}
