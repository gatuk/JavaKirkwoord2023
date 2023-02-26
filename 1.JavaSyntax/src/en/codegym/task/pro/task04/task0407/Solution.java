package en.codegym.task.pro.task04.task0407;

/* 
Sum of numbers not divisible by 3
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        int sum = 0;
        int i = 1;
        int n = 100;
        while (i <= n) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}