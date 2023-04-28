package en.codegym.task.pro.task09.task0906;

/* 
Binary converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //write your code here
        if (decimalNumber < 0) {
            return "";
        }
        String binaryNumber = "";
        while (decimalNumber != 0) {
            binaryNumber = (decimalNumber % 2) + binaryNumber;
            decimalNumber /= 2;

        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        //write your code here

        // for (int i = 0; i < length of the binary representation; i++) {
        // the decimal number = the decimal number + digit in the binary representation * 2 to the power of i
        //}
        //the public static toDecimal(String) method converts from the
        // string representation of a binary number to a decimal number.
        if (binaryNumber==null || binaryNumber.isEmpty()) {
            return 0;
        }
        int decimalNumber = 0;
        for (int i =0; i < binaryNumber.length(); i++) {
            decimalNumber = decimalNumber * 2 + binaryNumber.charAt(i) - '0';
        }
        return decimalNumber;

    }
}

