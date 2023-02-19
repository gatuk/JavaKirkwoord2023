package en.codegym.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Conscription
*/


public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", you've been drafted for military service";
        //write your code here
        int age;
        String name;
        //Insert amount and balance from console
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        age = input.nextInt();
        if ((age >= 18) && (age <= 28)) {
            System.out.println(name + militaryCommissar);
        }
    }
}