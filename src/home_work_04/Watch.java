package home_work_04;

import java.util.Random;

public class Watch {
    public static void main(String[] args) {
        Random rand = new Random();
        int secTime = rand.nextInt(0, 28800);
        System.out.println(secTime);
        runHourTime(secTime);
    }

    public static void runHourTime(int m) {
        int h = m / 3600;
        if (h < 1 ) {
            System.out.println("До конца рабочего дня осталось " + m + " секунд");
            System.out.println("До конца рабочего дня осталось менее одного часа");

        } else {
            System.out.println("До конца рабочего дня осталось " + m + " секунд");
            System.out.println("До конца рабочего дня осталось " + h + "ч");

        }
    }
}
