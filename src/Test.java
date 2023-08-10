import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> collected = bufferedReader.lines()
                .limit(3)
                .map(Integer::parseInt)
                .takeWhile(i -> i % 2 == 0)
                .collect(Collectors.toList());

        collected.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        boolean b = collected.stream()
                .anyMatch(i -> i % 4 == 0);
        System.out.println(b);

        boolean b1 = collected.stream()
                .noneMatch(integer -> integer % 8 == 0);
        System.out.println(b1);

        Integer first = collected.stream()
                .filter(integer -> integer % 16 == 0)
                .findFirst()
                .orElse(null);

        System.out.println(first);
    }
}
