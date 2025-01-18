import java.util.Scanner;
public class Q02 {
	public static void main(String[] args) {
		Scanner sk = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sk.nextInt();
		int[] num = new int[n];
		System.out.println("Enter the numbers: ");
		for(int i = 0; i < n; i++) {
			num[i] = sk.nextInt();
		}
		int min = num[0];
		int max = num[0];
		for(int i = 1; i < n; i++) {
			if(num[i] < min)
				min = num[i];
			if(num[i] > max)
				max = num[i];
		}
		System.out.println("Maximum Number: "+max);
		System.out.println("Minimum Number: "+min);
		sk.close();
	}

}
