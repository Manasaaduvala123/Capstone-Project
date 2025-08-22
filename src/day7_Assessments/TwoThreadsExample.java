
package day7_Assessments;
class MessageThread extends Thread {
    private String message;
    public MessageThread(String message) {
        this.message = message;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(300); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
public class TwoThreadsExample {
    public static void main(String[] args) {
        MessageThread t1 = new MessageThread("Hello from Thread 1");
        MessageThread t2 = new MessageThread("Greetings from Thread 2");
        t1.start();
        t2.start();
    }
}
