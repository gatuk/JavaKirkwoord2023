package en.codegym.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Wind speed
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        double meterPerSecond = scanner.nextInt();
        // 1 m/s = 3.6km/h
        int milePerHour = (int) Math.round(meterPerSecond * 3.6);
        System.out.println(milePerHour);

    }
}