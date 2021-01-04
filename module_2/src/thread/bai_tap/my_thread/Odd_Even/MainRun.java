package thread.bai_tap.my_thread.Odd_Even;

public class MainRun {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread thread = new Thread(oddThread);
        Thread thread1 = new Thread(evenThread);


        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.start();
        thread.notify();
    }
}
