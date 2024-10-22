package matrixLes2410;

import java.util.Random;

public class TaskMatrOtvet {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 21;
        int max = -1;
        int sum = 0;
        double avg;
        int[][] matrix1 = new int[5][5];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(21);
                System.out.print(matrix1[i][j] + "\t");
                if (matrix1[i][j] < min) {
                    min = matrix1[i][j];
                }
                if (matrix1[i][j] > max) {
                    max = matrix1[i][j];
                }
                sum += matrix1[i][j];
            }
            System.out.println();
        }
        avg = (double) sum / (matrix1.length * matrix1[0].length);
        System.out.println();
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

    }
}
