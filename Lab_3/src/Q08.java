public class Q08 {
	public static int smallestMissingPositive(int[] arr, int index, int smallest) {
        if (index == arr.length)
        	return smallest;
        if (arr[index] == smallest) 
        	return smallestMissingPositive(arr, 0, smallest + 1);
        return smallestMissingPositive(arr, index + 1, smallest);
    }
	public static void main(String[] args) {
		int[] arr = {4, 2, -1, 1};
		System.out.println("Smallest missing positive number: " + smallestMissingPositive(arr, 0, 1));
	}

}
