// A class that extends Thread
class DaemonExample extends Thread {
    public void run() {
        // Check if the thread is daemon
        if (isDaemon()) {
            System.out.println(getName() + " is a Daemon thread.");
        } else {
            System.out.println(getName() + " is a User thread.");
        }

        // Run a loop to simulate work
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // half-second delay
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

// Main class
public class Daemon {
    public static void main(String[] args) {
        DaemonExample t1 = new DaemonExample();
        DaemonExample t2 = new DaemonExample();

        // Set t1 as a Daemon thread (must be done before starting it)
        t1.setDaemon(true);

        // Start both threads
        t1.start();
        t2.start();

        System.out.println("Main thread is ending...");
    }
}
