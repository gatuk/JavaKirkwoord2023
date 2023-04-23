package en.codegym.task.pro.task09.task0913;

public class Solution {

    public static void main(String[] args) {

    }
    /*
    The getIndexOfFirstWord(String, String) method needs to return the index of the first character of
    the first instance of the word (the second method parameter) in the string (the first method parameter).
     */
    public static int getIndexOfFirstWord(String str, String word) {
        return str.indexOf(word);
    }
    /*
    The getIndexOfLastWord(String, String) method needs to return the index of the last character of
    the first instance of the word (the second method parameter) in the string (the first method parameter).
     */
    public static int getIndexOfLastWord(String str, String word) {
        return str.lastIndexOf(word);
    }

}
