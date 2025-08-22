package day7_Assessments;
class YieldThread extends Thread {
    public YieldThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            if (i == 3) {
                System.out.println(getName() + " is yielding...");
                Thread.yield();  
            }
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}
public class ThreadYieldExample {
    public static void main(String[] args) {
        YieldThread t1 = new YieldThread("Thread-A");
        YieldThread t2 = new YieldThread("Thread-B");

        t1.start();
        t2.start();
    }
}
