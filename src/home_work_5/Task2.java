package home_work_5;

import java.util.Scanner;//У вас на банковском счету N долларов.

//Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество долларов на счёте: ");
        int balance = scanner.nextInt();
        int days = 0;
        while (balance > 1) {
            int tranche = getMoney(balance);
            balance -= tranche;
            days++;
        }
        days++;
        System.out.println("Понадобится дней: " + days);
    }

    private static int getMoney(int num) {

        for (int i = num / 2; i > 0; i--) {
            if (num % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
