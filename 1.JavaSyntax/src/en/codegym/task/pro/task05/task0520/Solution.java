package en.codegym.task.pro.task05.task0520;

public class Solution {
    // The debugger used to step through the code line by line(F8) or
    // to step into loop/method(F7) to find error
    public static int result=105;
    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        int count = 0;
        //declare double loop variable fahrenheit
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            count++;
            result=correction;
            System.out.println(correction);
        }
        System.out.println(result);
        System.out.println(count);
    }
}

