import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            inputList.add(input);
//            System.out.println(inputList);
            if (findTheEnd(input)) {
                break;
            }
        }
//        System.out.println(inputList);
        IntStream.range(0, inputList.size())
                .forEach(index -> {
                    String element = inputList.get(index);
                    System.out.println(index + 1 + " " + element);
                });
    }

    static boolean findTheEnd (String inputString) {
        boolean isFound = Arrays.stream(inputString
                        .split(" "))
                .anyMatch(word -> word.equalsIgnoreCase("end-of-file."));
        return isFound;
    }
}