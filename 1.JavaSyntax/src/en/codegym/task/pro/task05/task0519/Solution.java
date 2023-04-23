package en.codegym.task.pro.task05.task0519;
import java.util.Arrays;
//Is anyone there?
public class Solution {
    // static means shared across all instances of the class
    // declare integer variable
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //write your code here
        // declare integer array name array2
        int[] array2 = Arrays.copyOf(array, array.length); // copyOf method
        Arrays.sort(array2);
        // now array2 is sorted
        if (Arrays.binarySearch(array2, element) >= 0) {
            System.out.println(true); // display
        } else {
            System.out.println(false);
        }
    }
}
