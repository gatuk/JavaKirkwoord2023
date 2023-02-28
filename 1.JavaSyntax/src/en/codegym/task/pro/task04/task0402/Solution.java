package en.codegym.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Everyone wants to be loved
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();  // read name eg.Regina


        String text = " loves me.";
        //write your code here
        int i = 0;
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }

    }
}
