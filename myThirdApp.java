import java.util.Scanner;
import java.text.DecimalFormat;

public class myThirdApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        while (true) {
            System.out.println("enter number of days 0 or negative to stop");
            int days = input.nextInt();

            if (days <= 0) {
                break;
            }

            int weeks = days / 7;
            int rest = days % 7;

            System.out.println(days + " days is " + weeks + " weeks and " + rest + " days");
        }

        while (true) {
            System.out.println("enter temperature in celsius -1 to stop");
            double celsius = input.nextDouble();

            if (celsius == -1) {
                break;
            }

            double fahrenheit = 1.8 * celsius + 32;
            double kelvin = celsius + 273.16;

            System.out.println("celsius " + format.format(celsius));
            System.out.println("fahrenheit " + format.format(fahrenheit));
            System.out.println("kelvin " + format.format(kelvin));
        }

        input.close();
    }
}
