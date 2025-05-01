import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

        // Filter numbers > 15, double them, and collect into a new list
        List<Integer> result = numbers.stream()
                                      .filter(n -> n > 15)
                                      .map(n -> n * 2)
                                      .collect(Collectors.toList());

        System.out.println("Filtered and Doubled: " + result);
    }
}
