package thread.bai_tap.my_thread;

public class NumberGenerator extends Thread {
    Number number;

    public NumberGenerator(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        number.showNumber();
    }

    public static void main(String[] args) {
        Number number = new Number();

        NumberGenerator threadA = new NumberGenerator(number);
        NumberGenerator threadB = new NumberGenerator(number);



        System.out.println("Start:");
        threadA.start();
        threadB.start();

    }
}

class Number {
    synchronized void showNumber() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
