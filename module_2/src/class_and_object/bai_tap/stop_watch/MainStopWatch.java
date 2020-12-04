package class_and_object.bai_tap.stop_watch;

import java.util.Date;

public class MainStopWatch {
    public static void main(String[] args) {
        Date starTime;
        Date endTime;
        int numberArray[] = new int[100000];
        for (int i = 0; i < numberArray.length ; i++) {
            numberArray[i] = (int) Math.floor((Math.random() * 100000));
        }
        StopWatch watch = new StopWatch();
        starTime = new Date();
        System.out.println("Start selection sort: " + starTime );
        watch.start();
        int indexMin, i, j;
        for (i = 0; i < numberArray.length - 1; i++) {
            indexMin = i;
            for (j = i + 1; j < numberArray.length; j++) {
                if (numberArray[j] < numberArray[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = numberArray[indexMin];
                numberArray[indexMin] = numberArray[i];
                numberArray[i] = temp;
            }
        }
        endTime = new Date();
        watch.stop();
        System.out.println("End selection sort: " + endTime);
        System.out.println("Degree : " + watch.getElapsedTime());
    }
}
