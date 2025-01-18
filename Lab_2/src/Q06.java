import java.util.Arrays;
public class Q06 {
	public static void reorder(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int[] result = new int[n];
		int left = 0;
		int right = n - 1;
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0)
				result[i] = arr[right--];
			else
				result[i] = arr[left++];
		}
		System.arraycopy(result, 0, arr, 0, n);
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Original Array: "+Arrays.toString(arr));
		reorder(arr);
		System.out.println("Reordered Array: "+Arrays.toString(arr));
	}
}
