package main;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        1. init array
        int[] arr = new int[10];
//        System.out.println(arr.length);

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 101);
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("the first item = " + arr[0]);
        System.out.println("the last item = " + arr[arr.length - 1]);
//        2. init array
//        int[] arrLiteral = {1, 2, 3, 4, 5};
//        System.out.println(arrLiteral.length);
//
//        String[] arrayString = {"Hello", "Java", "JS", "Python", "C#"};
//        System.out.println(arrayString.length);
    }
}

