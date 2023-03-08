package en.codegym.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Warm or cold
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "It's cold outside";
        String warm = "It's warm outside";
        //write your code here

        Scanner input = new Scanner(System.in);
        int temperature = input.nextInt();
        if (temperature < 0.0)
        {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}
