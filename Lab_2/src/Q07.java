public class Q07 {
	public static int factorial(int n) {
		int res = 1;
		for(int i = 2; i <= n; i++) {
			res *= i;
		}
		return res;
	}
	public static void main(String[] args) {
		int num = 6;
		System.out.println("Factorial of "+num+" is: "+factorial(num));
	}

}
