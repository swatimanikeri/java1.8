import java.util.*;
import java.util.stream.*;
public class StreamEx2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(87);
        marks.add(78);
        marks.add(45);
        System.out.println(marks);
//maping 
        List<Integer> Updatedmarks = marks.stream().map(i ->i+5).collect(Collectors.toList());
        System.out.println(Updatedmarks);
    }
}
