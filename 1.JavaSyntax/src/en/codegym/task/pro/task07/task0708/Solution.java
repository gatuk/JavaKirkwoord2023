package en.codegym.task.pro.task07.task0708;

public class Solution{
//    Implement the setValues(long value) method so that it assigns value of the value parameter to the a, b, c, and d variables.
//    Do not change the types of the a, b, c, and d variables.
    public static byte a;
    public static short b;
    public static int c;
    public static long d;
    public static void main(String[] args) {
        setValues(100);
     
    }
    private static void setValues( long value) {
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}