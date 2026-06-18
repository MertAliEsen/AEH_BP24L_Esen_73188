import java.util.Scanner;

public class myFourthApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("enter lower and upper limits ");
            int lower = input.nextInt();
            int upper = input.nextInt();

            if (upper <= lower) {
                System.out.println("done");
                break;
            }

            int sum = 0;
            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }

            int firstSquare = lower * lower;
            int lastSquare = upper * upper;
            System.out.println("sum of squares from " + firstSquare + " to " + lastSquare + " is " + sum);
        }

        boolean again = true;

        while (again) {
            System.out.println();
            System.out.println("simple calculator");
            System.out.println("1 add");
            System.out.println("2 subtract");
            System.out.println("3 multiply");
            System.out.println("4 divide");
            System.out.print("choose option ");

            if (!input.hasNextInt()) {
                System.out.println("invalid option try again");
                input.next();
                continue;
            }

            int option = input.nextInt();

            if (option < 1 || option > 4) {
                System.out.println("invalid option try again");
                continue;
            }

            System.out.print("enter first number ");
            double first = input.nextDouble();

            System.out.print("enter second number ");
            double second = input.nextDouble();

            if (option == 1) {
                System.out.println("result " + (first + second));
            } else if (option == 2) {
                System.out.println("result " + (first - second));
            } else if (option == 3) {
                System.out.println("result " + (first * second));
            } else if (option == 4) {
                if (second == 0) {
                    System.out.println("cant divide by zero");
                } else {
                    System.out.println("result " + (first / second));
                }
            }

            System.out.print("try again y/n ");
            String answer = input.next();

            if (!answer.equalsIgnoreCase("y")) {
                again = false;
            }
        }

        input.close();
    }
}
