package en.codegym.task.pro.task08.task0804;

/* 
Randomizer
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }
    // write your code here
    public static int generateNumber() {
        return (int) (Math.random() * 100);
    }
}
