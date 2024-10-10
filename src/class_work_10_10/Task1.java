package class_work_10_10;

public class Task1 {
    public static void main(String[] args) {
        //Задание: 1
        int a = 5;
        int b = 3;
        System.out.println(getSum(a, b));
    }
    //Задание: 1
    //Реализуйте метод который принимает два числа, сравнивает их и возвращает
    //сумму всех вхождений в максимальное число.
    private static int getSum(int a, int b) {
        int max = Math.max(a, b);
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
