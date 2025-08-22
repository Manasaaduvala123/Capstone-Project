
package day7_Assessments;
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Current thread: " + Thread.currentThread().getName());
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();  
    }
}
