public class GreetingApp {
    public static void main(String[] args) {
        String name;

        // Check if command-line argument is provided
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World"; // Default value
        }

        // Display personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}
