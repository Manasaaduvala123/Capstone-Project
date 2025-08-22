package day7_Assessments;
class EvenThread extends Thread {
    private final int max;
    public EvenThread(int max) {
        this.max = max;
    }
    public void run() {
        for (int i = 2; i <= max; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(200);  // Pause for visibility
            } catch (InterruptedException e) {
                System.out.println("Even Thread interrupted");
            }
        }
    }
}
class OddThread extends Thread {
    private final int max;

    public OddThread(int max) {
        this.max = max;
    }
    public void run() {
        for (int i = 1; i <= max; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(200);  // Pause for visibility
            } catch (InterruptedException e) {
                System.out.println("Odd Thread interrupted");
            }
        }
    }
}
public class EvenOddThreads {
    public static void main(String[] args) {
        int maxNumber = 10;
        EvenThread evenThread = new EvenThread(maxNumber);
        OddThread oddThread = new OddThread(maxNumber);
        evenThread.start();
        oddThread.start();
    }
}

