public class MethodOverloading {
    public static void main(String[] args) {
        // Call the overloaded printValue methods
        printValue(10);
        printValue(3.14);
        printValue("Hello!");
    }

    // First printValue method (int parameter)
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Second printValue method (double parameter)
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Third printValue method (String parameter)
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
