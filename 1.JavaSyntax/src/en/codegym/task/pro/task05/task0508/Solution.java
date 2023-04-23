package en.codegym.task.pro.task05.task0508;
import java.util.Scanner;
//Remove duplicate strings
// This gives error although duplicate is removed
public class Solution {
    //declare string array
    public static String[] strings;
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        //declare integer loop variable i
        for (int i = 0; i < strings.length; i++) {
            //strings[i] array
            strings[i] = scanner.nextLine();
        }
        //declare and end
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                //short circuit evaluation
                if (strings[i] != null && strings[i].equals(strings[j])) {
                    strings[i] = "null";
                    strings[j] = "null";
                }
            }
        }
        //declare and end at length
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", "); //value in the array
        }
    }
}
