import java.util.*;
import java.util.stream.*;

public class StreamEx {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(87);
        l.add(78);
        l.add(45);
        System.out.println(l);

        List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(l2);
    }
}
