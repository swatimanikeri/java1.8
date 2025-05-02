public class FunctionDemo2 {

    // A method that returns the sum of two integers
    public int add(int a, int b) {
        return a + b;
    }

    // A method that prints a greeting message
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Main method to run the program
    public static void main(String[] args) {
        FunctionDemo2 demo = new FunctionDemo2(); // create object

        int result = demo.add(5, 7); // call add method
        System.out.println("Sum: " + result); // prints: Sum: 12

        demo.greet("Swati"); // call greet method
        // prints: Hello, Swati!
    }
}
