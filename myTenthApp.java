import java.util.Arrays;

public class myTenthApp {

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int negatives = 0;
        int sum = 0;

        for (int n : input) {
            if (n < 0) {
                negatives++;
            } else if (n > 0) {
                sum += n;
            }
        }

        return new int[] {negatives, sum};
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);

        System.out.println("input array " + Arrays.toString(input));
        System.out.println("result array " + Arrays.toString(result));

        int[] emptyInput = {};
        int[] emptyResult = countAndSumElements(emptyInput);

        System.out.println("empty array result " + Arrays.toString(emptyResult));
    }
}
