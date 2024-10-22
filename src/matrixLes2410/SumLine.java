package matrixLes2410;

import java.util.Random;

public class SumLine {
  //  Дан двумерный массив размерностью 5х5, заполненный случайными
    // числами из диапазона от 0 до 20. Определить сумму по каждой строке
    // массива.
  public static void main(String[] args) {
      Random random = new Random();
      int[][] matrix = new int[5][5];
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
              matrix[i][j] = random.nextInt(21);
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
      int sumLine=0;
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
              sumLine+=matrix[i][j];
          }
          System.out.println("sumLine" + i + "=" + sumLine);
      }
  }
}
