package en.codegym.task.pro.task09.task0918;

/* 
Let's work with StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Learn, learn, and learn again! ";

        System.out.println(addTo(string, new String[]{"A", "rolling", "stone", "gathers", "no", "moss"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //write your code here
        //The addTo(String, String[]) method adds to the string received as the
        // first parameter, in order, all the strings in the array of strings
        // received as the second parameter and returns a StringBuilder object
        // based this cumulative string.To add a new value to an existing StringBuilder object,
        // you need to call its append(String) method and pass the new value to it.
        StringBuilder sb = new StringBuilder(string);
        for (String s : strings) {
            sb.append(s);
        }
        return sb;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //write your code here
        return new StringBuilder(string).replace(start, end, str);
    }
}
