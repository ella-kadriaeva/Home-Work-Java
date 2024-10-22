package home_work_06;

public class Task3 {
    //Дан массив размера  N-1  , содержащий только различные целые числа в диапазоне от  1 до N .
// Найдите недостающий элемент.
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        int N = 5;
        System.out.println("В массиве отсутствует число " + getElement(array, N));
    }

    public static int getElement(int[] array, int N) {
        int sumArray = 0;
        int sumN = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];

        }

        for (int i = 1; i < N + 1; i++) {
            sumN += i;
        }
        return (sumN - sumArray);

    }
}

