package en.codegym.task.pro.task09.task0903;

/* 
String literals
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        String text = "Always write code as if the guy who ends up " +
                "maintaining your code will be a violent psychopath who " +
                "knows where you live. Martin Golding";
        //you need to split it into 5 substrings and concatenate
        // them with the "+" (string concatenation) operator, like this:
        String concat = "";
        String [] strSplit = text.split("", 5);
        for (int i = 0; i < strSplit.length; i++) {
            concat += strSplit[i] + "+";
        }
        System.out.println(concat);
    }
    // This is wrong
}