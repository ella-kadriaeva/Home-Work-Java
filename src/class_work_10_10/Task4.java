package class_work_10_10;

public class Task4 {
    public static void main(String[] args) {
        //Задание: 4
        int num1 = 0;
        int num2 = 100;
        getEven(num1, num2);
    }
    //Задание 4:
    //В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
    private static void getEven(int num1, int num2) {
        int count =0;
        for (int i = num1; i <= num2; i++) {
            if(count ==25) {
                break;
            }
            if (i % 2 == 0 && i%10 !=0) {
                count ++;
                System.out.println(i);

            }
        }
    }
}
