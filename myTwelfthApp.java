import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path inputPath;

        while (true) {
            System.out.print("enter input file path ");
            String inputFile = input.nextLine();
            inputPath = Paths.get(inputFile);

            if (Files.exists(inputPath)) {
                break;
            }

            System.out.println("file doesnt exist try again");
        }

        System.out.print("enter output file path ");
        String outputFile = input.nextLine();
        Path outputPath = Paths.get(outputFile);

        try {
            long lineCount = Files.readAllLines(inputPath).size();

            String result = "file name " + inputPath.getFileName() + System.lineSeparator() + "number of lines " + lineCount + System.lineSeparator();

            System.out.println("file name " + inputPath.getFileName());
            System.out.println("number of lines " + lineCount);

            Files.writeString(outputPath, result);
            System.out.println("result saved to " + outputPath);
        } catch (IOException e) {
            System.out.println("error " + e.getMessage());
        }

        input.close();
    }
}
