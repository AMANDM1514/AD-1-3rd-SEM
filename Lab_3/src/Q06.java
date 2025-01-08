public class Q06 {
	public static String decimalToHexadecimal(int n) {
        if (n == 0) 
        	return "";
        String hexDigits = "0123456789ABCDEF";
        return decimalToHexadecimal(n / 16) + hexDigits.charAt(n % 16);
    }
	public static void main(String[] args) {
		int n = 255;
		System.out.println("Decimal "+n+" to Hexadecimal: " + decimalToHexadecimal(n));
	}
}