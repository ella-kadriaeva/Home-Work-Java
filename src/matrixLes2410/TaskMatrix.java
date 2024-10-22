package matrixLes2410;

import java.util.Random;

public class TaskMatrix {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        double sum =matrixSum(matrix);
        System.out.println(sum);
        double middlSum= sum /25;
        System.out.println(middlSum);
        System.out.println(matrixSortMax(matrix));
        System.out.println(matrixSortMin(matrix));
    }

    private static int matrixSum(int[][] matrix) {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum=sum + matrix[i][j];

            }
        }
        return sum;
    }

    private static int matrixSortMax(int[][] matrix) {
      int max=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
             if(max<matrix[i][j]) {
                 max=matrix[i][j];
             };

            }
        }
        return max;
    }
    private static int matrixSortMin(int[][] matrix) {
        int min=51;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(min>matrix[i][j]) {
                    min=matrix[i][j];
                };

            }
        }
        return min;
    }
}