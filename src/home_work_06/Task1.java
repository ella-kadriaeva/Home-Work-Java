package home_work_06;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    //    Создайте массив из 8 случайных целых чисел из интервала [1;50]
//    Выведите массив на консоль в строку.
//    Замените каждый элемент с нечетным индексом на ноль.
//    Снова выведете массив на консоль в отдельной строке.
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1, 50);

        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i+=2) {
            arr[i] = 0;

        }
        System.out.println(Arrays.toString(arr));
    }

}


