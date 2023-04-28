package en.codegym.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //write your code here
        //Using a StringTokenizer, split the query variable into parts based on the delimiter variable.
        //The maximum possible number of tokens is 6.
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] tokens = new String[st.countTokens()];
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = st.nextToken();
        }
        return tokens;
    }
}
