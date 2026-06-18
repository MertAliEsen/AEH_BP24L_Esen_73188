import java.util.Scanner;

public class mySixthApp {

    public static long factorialIterative(int n) {
        long value = 1;

        for (int i = 2; i <= n; i++) {
            value *= i;
        }

        return value;
    }

    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter number n ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("factorial is not defined for negative numbers");
            input.close();
            return;
        }

        long start = System.nanoTime();
        long iterative = factorialIterative(n);
        long iterativeTime = System.nanoTime() - start;

        start = System.nanoTime();
        long recursive = factorialRecursive(n);
        long recursiveTime = System.nanoTime() - start;

        System.out.println("iterative result " + iterative);
        System.out.println("iterative time " + iterativeTime + " ns");

        System.out.println("recursive result " + recursive);
        System.out.println("recursive time " + recursiveTime + " ns");

        input.close();
    }
}
