package main;

import java.util.Arrays;
import java.util.Random;

public class Task41610 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-20, 20);

        }
        System.out.println(Arrays.toString(arr));

        int pos = 0;
        int sum = 0;
        double middle =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
                sum = sum + arr[i];
            }
        }
            middle = sum / pos;
            System.out.println(pos);
            System.out.println(sum);
            System.out.println(middle);
        }
    }