
public class Q01 {
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {95, 15, 58, 26, 57};
		int key = 26;
		int result = linearSearch(arr, key);
		System.out.println(result != -1 ? "Key found at index: " + result : "Key not found");
	}
}
