// Declare the package
package mypackage;

// Class inside the package
public class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
}







// Import the user-defined package
import mypackage.Calculator;

public class MainProgram {
    public static void main(String[] args) {
        // Create object of Calculator
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }
}
