package en.codegym.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Maximum of entered numbers
*/
public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner =  new Scanner (System.in);
        int maxEvenNumber = scanner.nextInt();

        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number %2 !=1 && number > maxEvenNumber) {
                maxEvenNumber = number;
            }
        }
        System.out.println(maxEvenNumber);

    }
}