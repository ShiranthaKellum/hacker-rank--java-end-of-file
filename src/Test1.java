import java.util.Scanner;
import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a stream of lines from user input
        IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .mapToObj(i -> i + " " + scanner.nextLine()) // Combine line number with input line
                .takeWhile(line -> !line.endsWith("end-of-file.")) // Stop at the end-of-file line
                .forEach(System.out::println); // Print each line

        scanner.close();
    }
}
