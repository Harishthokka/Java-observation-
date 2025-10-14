public class ExceptionHandling{
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } 
        finally {
            System.out.println("This block always executes.");
        }

        System.out.println("Program continues after exception handling...");
    }
}
