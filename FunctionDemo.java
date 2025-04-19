import java.util.function.*;
class FunctionDemo{
    public static void main(String[] args) {
        Function<String,Integer> f=s->s.length();
        System.out.println(f.apply("swati"));
    }
}