package main;

import java.util.Arrays;

public class MetodsofArray {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayCopy = Arrays.copyOf(arrayOne, 3);

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayCopy));

        int[] arrayRange = Arrays.copyOfRange(arrayOne, 1, 3);
        System.out.println(Arrays.toString(arrayRange));

        int[] arrSort = {5, 3, 1, 19, 0};
        System.out.println(Arrays.toString(arrSort));
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort));
    }
}
