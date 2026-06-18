import java.util.Scanner;

public class myFifthApp {
    public static void printCharacters(char c, int width, int rows) {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < width; column++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a character ");
        char c = input.next().charAt(0);

        System.out.print("enter characters in one row ");
        int width = input.nextInt();

        System.out.print("enter rows ");
        int rows = input.nextInt();

        printCharacters(c, width, rows);

        input.close();
    }
}
