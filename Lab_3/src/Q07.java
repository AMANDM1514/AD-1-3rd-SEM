public class Q07 {
	public static double power(double base, int exp) {
		if (exp == 0)
			return 1;
		if (exp < 0) 
			return 1 / power(base, -exp);
	    return base * power(base, exp - 1);
	}
	public static void main(String[] args) {
		int base = 7;
		int exp = 3;
		System.out.println(base+" raised to the power of "+exp+": " + power(base, exp));
	}

}
