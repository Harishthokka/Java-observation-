// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
    
    // Common method to display the area
    void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
}

// Circle class extending Shape
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implementing abstract method
    double calculateArea() {
        return length * breadth;
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementing abstract method
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class AreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 8);

        System.out.println("Circle:");
        circle.displayArea();

        System.out.println("\nRectangle:");
        rectangle.displayArea();

        System.out.println("\nTriangle:");
        triangle.displayArea();
    }
}
