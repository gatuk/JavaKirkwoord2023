package en.codegym.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Wind speed
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        double meterPerSecond = scanner.nextDouble();
        // 1 m/s = 3.6km/h
        int kiloMeterPerHour = (int) Math.round(meterPerSecond * 3.6);
        System.out.println(kiloMeterPerHour);

        // Initially I stated the answer milePerHour by mistake
        // But I realized 1 m/s = 2.23694 mph.

        int milePerHour = (int) Math.round(meterPerSecond * 2.23694);
        System.out.println(milePerHour);
        scanner.close();

    }
}