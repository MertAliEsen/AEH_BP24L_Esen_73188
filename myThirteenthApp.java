import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class myThirteenthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Path inputPath = getExistingInputFile(scanner);
        Path outputPath = getOutputFile(scanner);

        Map<String, Integer> wordOccurrences = new LinkedHashMap<>();
        int totalWordCount = 0;

        try (BufferedReader reader = Files.newBufferedReader(inputPath)) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[^\\p{L}\\p{N}']+");

                for (String word : words) {
                    if (word.isBlank()) {
                        continue;
                    }


                    String normalizedWord = word.toLowerCase();

                    totalWordCount++;

                    wordOccurrences.put(
                            normalizedWord,
                            wordOccurrences.getOrDefault(normalizedWord, 0) + 1
                    );
                }
            }

            String result = createResult(
                    inputPath,
                    totalWordCount,
                    wordOccurrences
            );

            System.out.println("\n--- RESULT ---");
            System.out.println(result);

            try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
                writer.write(result);
            }

            System.out.println("Results saved to:");
            System.out.println(outputPath.toAbsolutePath());

        } catch (IOException exception) {
            System.out.println("An error occurred while reading or writing the file.");
            System.out.println("Error: " + exception.getMessage());
        }

        scanner.close();
    }

    private static Path getExistingInputFile(Scanner scanner) {
        while (true) {
            System.out.print("Enter the path of the input text file: ");
            String userInput = scanner.nextLine().trim();

            userInput = removeQuotes(userInput);

            try {
                Path inputPath = Paths.get(userInput);

                if (Files.exists(inputPath) && Files.isRegularFile(inputPath)) {
                    return inputPath;
                }

                System.out.println("The input file does not exist. Please enter another file.");

            } catch (InvalidPathException exception) {
                System.out.println("The entered file path is invalid. Please try again.");
            }
        }
    }

    private static Path getOutputFile(Scanner scanner) {
        while (true) {
            System.out.print("Enter the path of the output file: ");
            String userInput = scanner.nextLine().trim();
            userInput = removeQuotes(userInput);

            try {
                Path outputPath = Paths.get(userInput);

                Path parentFolder = outputPath.toAbsolutePath().getParent();

                if (parentFolder != null && !Files.exists(parentFolder)) {
                    System.out.println("The output folder does not exist. Please try again.");
                    continue;
                }

                return outputPath;

            } catch (InvalidPathException exception) {
                System.out.println("The entered file path is invalid. Please try again.");
            }
        }
    }

    private static String createResult(
            Path inputPath,
            int totalWordCount,
            Map<String, Integer> wordOccurrences
    ) {
        StringBuilder result = new StringBuilder();

        result.append("File name: ")
                .append(inputPath.getFileName())
                .append(System.lineSeparator());

        result.append("Total number of words: ")
                .append(totalWordCount)
                .append(System.lineSeparator());

        result.append(System.lineSeparator());
        result.append("Number of occurrences of each word:")
                .append(System.lineSeparator());

        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            result.append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append(System.lineSeparator());
        }

        return result.toString();
    }

    private static String removeQuotes(String value) {
        if (value.length() >= 2 && value.startsWith("\"") && value.endsWith("\"")) {
            return value.substring(1, value.length() - 1);
        }

        return value;
    }
}