// First interface
interface Animal {
    void eat();
}

// Second interface
interface Bird {
    void fly();
}

// A class implementing both interfaces
class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Bat eats insects.");
    }

    public void fly() {
        System.out.println("Bat can fly.");
    }
}

// Main class
public class Multipleinheritinterface {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.eat();
        b.fly();
    }
}
