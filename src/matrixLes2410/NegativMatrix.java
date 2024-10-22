package matrixLes2410;

import java.util.Random;

public class NegativMatrix {
    public static void main(String[] args) {
        int pos=0;
        int neg=0;
        int zero=0;
        Random random = new Random();
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(-5, 6);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0) {
                    zero+=1;
                }else if(matrix[i][j]>0){
                    pos+=1;
                }else{neg+=1;}
            }

        }
        System.out.println(zero);
        System.out.println(neg);
        System.out.println(pos);
    }
}
