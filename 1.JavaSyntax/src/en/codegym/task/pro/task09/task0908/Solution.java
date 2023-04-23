package en.codegym.task.pro.task09.task0908;

public class Solution {

    public static String toHex(String binaryNumber) {
        //write your code here
        /*If  binaryNumber contains
        any character other than 0 or 1, then the method returns an empty string.
         */
        if (binaryNumber == null || binaryNumber.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == '1') {
                sb.append("0");
            } else {
                sb.append("1");
            }
        }
        return sb.toString();

    }
}
