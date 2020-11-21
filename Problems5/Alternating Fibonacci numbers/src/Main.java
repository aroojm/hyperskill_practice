import java.util.Scanner;

public class Main {

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return (-1) * (Math.abs(fib(n - 1)) + Math.abs(fib(n - 2)));
        } else {
            return Math.abs(fib(n - 1)) + Math.abs(fib(n - 2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}