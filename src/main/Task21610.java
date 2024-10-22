package main;

import java.util.Arrays;
import java.util.Random;

public class Task21610 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1, 10);

        }

        System.out.println(Arrays.toString(arr));


        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println(odd);
        System.out.println(even);

    }
}
