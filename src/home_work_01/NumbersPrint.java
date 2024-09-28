package home_work_01;

public class NumbersPrint {
    public static void main(String[] args) {
        int number = 526;
        int firstNumber= number / 100;
        int secondNumber =number % 100 /10;
        int thirdNumber = number - firstNumber *100 - secondNumber *10;
        System.out.printf("%d, %d, %d", firstNumber, secondNumber, thirdNumber);
    }
}
