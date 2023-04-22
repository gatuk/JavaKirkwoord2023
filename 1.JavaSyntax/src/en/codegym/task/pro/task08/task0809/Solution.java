package en.codegym.task.pro.task08.task0809;

/*
Counter

*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
            printNumbers();
    }
    //In the Solution class, implement the printNumbers() method, which prints numbers from 1 to 10 inclusive
    // with a 1.3-millisecond pause between each number.
    // The Thread class's sleep(long, int) method will help you do this.
    public static void printNumbers() throws InterruptedException {
            // write your code here
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1300000);
            }
        }
}
