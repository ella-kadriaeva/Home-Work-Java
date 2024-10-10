package class_work_10_10;

public class Task2 {
    public static void main(String[] args) {
        //Задание: 2
        int num1 = 0;
        int num2 = 100;
        print(num1, num2);
    }
    //Задание: 2
    //Вывести на экран в одну строку все нечётные числа от 0 до 100.
    public static void print(int num1, int num2) {
        for (int i = 1; i <= num2; i+=2) {
            System.out.print(i + " ");
        }
    }
}
