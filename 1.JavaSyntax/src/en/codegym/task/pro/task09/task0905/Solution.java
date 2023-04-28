package en.codegym.task.pro.task09.task0905;

/* 
Octal converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        int octalNumber = 0;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //write your code here
        if (decimalNumber <= 0) {
            return 0;
        }
        int i = 0;
        int octalNumber = 0;
        while (decimalNumber!= 0) {
            octalNumber = (int) ((octalNumber) + Math.pow(((decimalNumber % 8) * 10),i));
            decimalNumber = decimalNumber / 8;
            i++;
        }
        return octalNumber;

    }

    public static int toDecimal(int octalNumber) {
        //write your code here
        if (octalNumber <= 0) {
            return 0;
        }
        int i = 0;
        double decimalNumber = 0;
        while (octalNumber!= 0) {
            //the decimal number = the decimal number + (remainder of the division of the octal number by 10) * 8 to the power of i
            decimalNumber = ((decimalNumber) + Math.pow(((octalNumber % 10) * 8),i));
            octalNumber = octalNumber / 10;
            i++;
        }
        return (int) decimalNumber;
    }

    // This is wrong
}
