package thread.bai_tap.my_thread.Odd_Even;

public class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i < 11 ; i=i+2) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
