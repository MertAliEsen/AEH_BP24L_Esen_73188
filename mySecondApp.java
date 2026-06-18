import java.util.Scanner;

public class mySecondApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 10;
        int twice = x * 2;
        int squared = x * x;

        System.out.println("x = " + x);
        System.out.println("double of x = " + twice);
        System.out.println("x squared = " + squared);

        System.out.println("enter your age in years");
        int age = input.nextInt();

        long seconds = (long) age * 365 * 24 * 60 * 60;
        System.out.println("my age in seconds " + seconds);

        input.close();
    }
}
