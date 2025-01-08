public class Q04 {
    public static int fib(int a, int b, int n) {
        if (n == 0)
            return a;
        return fib(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1, n = 6;
        System.out.println(n + "th Fibonacci number: " + fib(a, b, n));
    }
}
