package en.codegym.task.pro.task05.task0505;
import java.util.Scanner;
//Reverse
public class Solution {
    public static void main(String[] args) {
        //write your code here
        //Reads an integer N from the console.
        // If the number N is greater than 0, then the program reads an additional N integers.
        // If N is odd, display them in the order in which there were entered.
        // If N is even, display them in reverse order.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //create
        int[] array = new int[n];
        if (n > 0) {
            //declare
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        }
        if (n % 2 == 1) {
            //declare
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            //declare
            for (int i = array.length; i > 0; i--) {
                System.out.print(array[i - 1] + " ");
            }
        }
    }
}