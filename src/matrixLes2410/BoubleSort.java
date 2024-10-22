package matrixLes2410;

import java.util.Arrays;
import java.util.Random;

public class BoubleSort {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortBubble(int[] arr) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
//https://proglib.io/p/java-sorting-algorithms