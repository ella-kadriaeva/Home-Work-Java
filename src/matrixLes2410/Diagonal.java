package matrixLes2410;

import java.util.Random;

public class Diagonal {
//    Дан двумерный массив размерностью 5х5,
//    заполненный случайными числами из диапазона от 0 до 20.
//    Определить сумму элементов, расположенных на главной
//    диагонали, а также сумму элементов, расположенных на побочной диагонали.
public static void main(String[] args) {
    Random random = new Random();
    int[][] matrix = new int[5][5];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = random.nextInt(3);
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println(getSumMainD(matrix));
    System.out.println(getSumOtherD(matrix));
}
    private static int getSumMainD(int[][] matrix) {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i==j) { sum=sum + matrix[i][j];}


            }
        }
        return sum;
    }
    private static int getSumOtherD(int[][] matrix) {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j==matrix.length-i) { sum=sum + matrix[i][j];}


            }
        }
        return sum;
    }
}
