package home_work_5;

public class Task3 {


//Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//Лифт сломан.
//Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъеме лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
//Найдите количество подъемов, которые понадобятся лифту.


    public static void main(String[] args) {
        int H = 200;
        int N = 50;
        int M = 1;

        int liftsNeeded = numberOfLifts(H, N, M);
        System.out.println("Количество подъемов: " + liftsNeeded);
    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int currentFloor = 0;
        int lifts = 0;

        while (currentFloor < floor) {
            lifts++;
            currentFloor += stepUp;

            if (currentFloor >= floor) {
                break;
            }

            currentFloor -= stepDown;
        }

        return lifts;
    }
}
