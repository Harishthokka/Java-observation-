class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphis {
    public static void main(String[] args) {
        Animal a;  // reference variable of parent class

        a = new Dog();  // object of Dog
        a.sound();      // calls Dog's sound()

        a = new Cat();  // object of Cat
        a.sound();      // calls Cat's sound()
    }
}
