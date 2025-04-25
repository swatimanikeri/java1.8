
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie", "David");

        // Filter names that start with 'A' or 'B', sort them, and print
        List<String> filteredSortedNames = names.stream()
                .filter(name -> name.startsWith("A") || name.startsWith("B"))
                .sorted()
                .collect(Collectors.toList());

        filteredSortedNames.forEach(System.out::println);
    }
}
