public class Q05 {
	public static int missing_Number(int arr[], int size) {
		int n = size;
		int i = 0;
		while(i < n) {
			int el = arr[i];
			int index = el - 1;
			if(index >= 0 && index < n) {
				if(arr[index] != el) {
					int temp = arr[index];
					arr[index] = arr[i];
					arr[i] = temp;
					continue;
				}
			}
			i++;
		}
		for(i = 0; i < n; i++) {
			if(arr[i] != i+1) {
				return i + 1;
			}
		}
		return n + 1;
	}
	public static void main(String[] args) {
		int arr[] = {-5, 4, 6, 1, 9, 7};
		System.out.println("The smallest positive missing number is: "+missing_Number(arr, arr.length));
	}

}
