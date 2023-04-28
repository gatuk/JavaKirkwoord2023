package en.codegym.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";
    private static String hex;

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }
    /*
    If the input parameter is less than or equal to 0,
    the toHex(int) method returns an empty string.
     */
    // (the decimal number is not 0) {
    // the hexadecimal representation = the character in the HEX string that has
    // an index equal to the remainder of the decimal number divided by 16
    // the hexadecimal representation of the number
    // the decimal number = the decimal number / 16
    public static String toHex(int decimalNumber) {
        //write your code here
        if (decimalNumber <= 0) {
            return "";
        }
        String hex = "";
        while (decimalNumber !=0) {
            hex = HEX.charAt(decimalNumber % 16) + hex;
            decimalNumber = decimalNumber / 16;
        }
        return hex;

    }

    public static int toDecimal(String hexNumber) {
        //write your code here
        int decimalNumber = 0;
        if (hexNumber == null || hexNumber.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            decimalNumber = decimalNumber * 16 + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimalNumber;
    }
}

