package en.codegym.task.pro.task06.task0609;
/*
A cubed cube calculator
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(ninthDegree(3));

    }
    public static long cube(long a) {
        return a * a * a;
    }
    //write your code here
    public static long ninthDegree(long a) {
        return cube(cube(a));
    }
}
