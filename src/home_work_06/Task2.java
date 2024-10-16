package home_work_06;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    //Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10, 99);
        }

        System.out.println(Arrays.toString(arr));
        if (getResult(arr)) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        };


    }

    private static boolean getResult(int[] arr) {
        int min = arr[0];
        boolean res = false;
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] > min && arr[i] < arr[4]) {
                min = arr[i];
                res = true;

            } else {
                res = false;
                break;
            }

        } return res;
    }
}
