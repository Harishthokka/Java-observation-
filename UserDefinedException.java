// User-defined exception class
class InvalidAgeException extends Exception {
    private String message;

    // Constructor without using super
    public InvalidAgeException(String msg) {
        message = msg;
    }

    // Overriding toString() to display the message
    public String toString() {
        return "InvalidAgeException: " + message;
    }
}

// Main class
public class UserDefinedException {
    // Method that throws the exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18 — Not eligible to vote!");
        } else {
            System.out.println("Eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);  // This will throw the user-defined exception
        } 
        catch (InvalidAgeException e) {
            System.out.println(e);  // calls toString() method
        }

        System.out.println("Program continues normally...");
    }
}
