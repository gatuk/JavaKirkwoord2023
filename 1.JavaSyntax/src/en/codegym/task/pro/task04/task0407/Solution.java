package en.codegym.task.pro.task04.task0407;

/* 
Sum of numbers not divisible by 3
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        //Display the sum of numbers from 1 to 100 inclusive that are not multiples of 3.
        // Use a while loop to do this.
        // Hint: To move to the next number in the loop, use a continue statement.
        int i = 1;
        int n = 100;
        int sum = 0;
        while (i <= n) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println(sum);
        //can be done without using continue
        // sum of numbers from 1 to 100 that are not multiples of 3.
        while (i <= n) {
            if (i % 3 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }

}