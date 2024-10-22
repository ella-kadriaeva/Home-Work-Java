package main;

public class ArrayTask {
    public static void main(String[] args) {
        int[] arrL = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrL[1]);
        System.out.println(arrL[arrL.length-2]);
        for(int i=0; i<arrL.length; i++){
            System.out.print(arrL[i]);
        };

        for(int j=0; j < arrL.length; j++) {
            arrL[j]=-1;
            System.out.print(arrL[j]);
        }

        Student[] studentsArray = new Student[10];
        for (int i = 0; i < studentsArray.length; i++) {
            System.out.print(studentsArray[i] + " ");
        }

        Student[] studentsLiteral = new Student[] {
                new Student("Alex"),
                new Student("Max"),
                new Student("Bob")
        };

        System.out.println();
        for (int i = 0; i < studentsLiteral.length; i++) {
            System.out.print(studentsLiteral[i] + " ");
        }


    }}







