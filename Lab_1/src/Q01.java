import java.util.Scanner;
public class Q01 {
	public static void main(String[] args) {
		Scanner sk = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sk.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("The sum of first "+n+" numbers is: "+sum);
		sk.close();
	}
}
