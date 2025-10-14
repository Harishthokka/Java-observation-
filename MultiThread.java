// Thread 1: Displays "Good Morning" every 1 second
class Thread1 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning");
                Thread.sleep(1000); // 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread1 interrupted");
        }
    }
}

// Thread 2: Displays "Hello" every 2 seconds
class Thread2 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Hello");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread2 interrupted");
        }
    }
}

// Thread 3: Displays "Welcome" every 3 seconds
class Thread3 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Welcome");
                Thread.sleep(3000); // 3 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread3 interrupted");
        }
    }
}

// Main class
public class MultiThread {
    public static void main(String[] args) {
        // Create thread objects
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
