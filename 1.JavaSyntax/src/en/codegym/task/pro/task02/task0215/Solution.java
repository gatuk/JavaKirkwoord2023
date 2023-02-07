package en.codegym.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Reading numbers
*/

public class Solution {

    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int arithmeticMean = (n1 + n2 + n3) / 3;
        System.out.println(arithmeticMean);



    }
}
