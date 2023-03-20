package en.codegym.task.pro.task05.task0510;

public class Solution {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //Create a triangular array where the value of each element is the sum of its indices.
        for (int i = 0; i < 10; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }
}
