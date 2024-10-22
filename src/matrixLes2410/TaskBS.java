package matrixLes2410;

import java.util.Arrays;

public class TaskBS {
//    Дан массив {22, 3, 4, 2, 50}
//    Реализуйте метод bubbleSort(int[] array)
//    Выведите на консоль массив до и после сортировки
public static void main(String[] args) {
    int[] arr = {22, 3, 4, 2, 50};
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

