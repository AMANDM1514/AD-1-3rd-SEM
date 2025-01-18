public class Q04 {
	public static int max_SubArray(int num[]) {
		if(num.length < 1)
			return 0;
		int max = num[0];
		int max_Begin = 0, max_End = 0;
		int begin = 0, end = 0, sum = 0;
		while(end < num.length) {
			sum += num[end];
			if(sum < 0) {
				sum = 0;
				begin = end +1;
			}
			else {
				if(sum > max) {
					max = sum;
					max_Begin = begin;
					max_End = end;
				}
			}
			end ++;
		}
		System.out.println("Maximum Subarray starts at index: " + max_Begin); 
		System.out.println("Maximum Subarray ends at index: " + max_End);
		return max;
	}
	public static void main(String[] args) {
		int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.print(max_SubArray(num));
	}

}
