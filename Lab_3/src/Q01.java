public class Q01 {
	public static int sumOfNumbers(int n) {
        if (n <= 0) 
        	return 0;
        return n + sumOfNumbers(n - 1);
    }
	public static void main(String[] args) {
		int n = 6;
        System.out.println("Sum of first "+n+" numbers: " + sumOfNumbers(n));
	}
}