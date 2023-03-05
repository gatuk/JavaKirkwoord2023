package en.codegym.task.pro.task05.task0517;

import java.util.Arrays;

/*
Splitting an array
*/
public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    /* Implement the main(String[]) method, which splits an array into two subarrays and fills a two-dimensional result array with them.
     If the length of the array is odd, then the larger half should be copied into the first subarray.
     Use the Arrays.copyOfRange(int[], int, int) method to split the array. Do not change the order of the elements.
     During testing, the values of the fields in the Solution class will be different. Take that into consideration.
     */
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(result));
        int mid= array.length / 2;
        if(array.length % 2 == 0) {
            result[0] = Arrays.copyOfRange(array, 0,mid);
            result[1] = Arrays.copyOfRange(array, mid, array.length);
            System.out.println(Arrays.deepToString(result));
        }

        if (array.length % 2 != 0) {
            result[0] = Arrays.copyOfRange(array, 0, mid+1); //copy the first half
            result[1] = Arrays.copyOfRange(array, mid+1, array.length);// copy the second half
            System.out.println(Arrays.deepToString(result));
        }


    }
}