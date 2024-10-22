package matrixLes2410;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1, 50);
        }
        System.out.println(Arrays.toString(arr));
        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое от 1 до 50");
        int key = in.nextInt();
        int result = searchLinear(arr, key);
        if (result != -1) {
            System.out.println(key + " is on " + (result+1) + " position");
        } else {
            System.out.println("Not found");
        }
    }

    public static int searchLinear(int[] arr, int key) {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
