public class MultipleCatch{
    public static void main(String[] args) {
        try {
            // Example 1: ArithmeticException
            int a = 10, b = 0;
            int result = a / b;  // division by zero

            // Example 2: ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // invalid index

            // Example 3: NumberFormatException
            String str = "abc";
            int num = Integer.parseInt(str);  // invalid number
        } 

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range!");
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }

        catch (Exception e) {
            System.out.println("General Exception: " + e);
        }

        System.out.println("Program continues after exception handling...");
    }
}
