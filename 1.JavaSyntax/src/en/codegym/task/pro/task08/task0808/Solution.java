package en.codegym.task.pro.task08.task0808;

/* 
Countdown
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        countDown();
    }
    /*
    The countDown() method of the Solution class has a countdown.
    You need to ensure that there is a
    1-second pause between each instance of console output.
    The Thread class's sleep(long) method will help you do this.
    */
    public static void countDown() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Start!");
    }
}
