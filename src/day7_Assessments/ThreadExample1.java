package day7_Assessments;
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();  
    }
}
