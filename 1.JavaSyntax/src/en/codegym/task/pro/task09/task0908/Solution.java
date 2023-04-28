package en.codegym.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/

public class Solution {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //write your code here
//        If the input parameter of the toHex(String) method contains
//        any character other than 0 or 1, then the method returns an empty string.
        if (!binaryNumber.matches("[01]+")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) >= '0' && binaryNumber.charAt(i) <= '1') {
                sb.append(binaryNumber.charAt(i));
            }
        }
        return sb.toString();

    }
    public static String toBinary(String hexNumber) {
        //write your code here
        /*
       If the input parameter of the toBinary(String) method
       contains any character other than digits
       from 0 to 9 or lowercase Latin letters
       from a to f, then the method returns an empty string.
         */
        if (!hexNumber.matches("[0-9a-f]+")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            if (hexNumber.charAt(i) >= '0' && hexNumber.charAt(i) <= '9') {
                sb.append(hexNumber.charAt(i));
            }
        }
        return sb.toString();
    }

// This is wrong
}
