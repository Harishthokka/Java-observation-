// Thread class that prints numbers
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for half a second
            } catch (InterruptedException e) {
                System.out.println(getName() + " Interrupted");
            }
        }
        System.out.println(getName() + " has finished execution.");
    }
}

// Main class
public class Isalive{
    public static void main(String[] args) {
        // Create thread objects
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Start threads
        t1.start();
        t2.start();

        // Check if threads are alive after starting
        System.out.println("t1 is alive: " + t1.isAlive());
        System.out.println("t2 is alive: " + t2.isAlive());

        try {
            // Wait for both threads to finish using join()
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // Check again after threads complete
        System.out.println("t1 is alive after join: " + t1.isAlive());
        System.out.println("t2 is alive after join: " + t2.isAlive());

        System.out.println("Main thread finished.");
    }
}
