package home_work_5;

public class Task1 {

    // 1 уровень сложности: №1.
//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.
    public static void main(String[] args) {
        int temperature1=80;
        int temperature2=120;
        checkTemp(temperature1, temperature2);
        if(checkTemp(temperature1, temperature2)) {
            System.out.println("OK");
        } else{
        System.out.println("Error");}

    }

    public static boolean checkTemp(int t1, int t2) {
        return (t1>100 && t2<100);

    }
}