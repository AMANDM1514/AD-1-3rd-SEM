public class Q08 {
    public static int fib(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        int prev = 0, current = 1;
        for (int i = 3; i <= n; i++) {
            int temp = current;
            current = prev + current;
            prev = temp;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println("The " + n + " positioned Fibonacci number is: " + fib(n));
    }
}
