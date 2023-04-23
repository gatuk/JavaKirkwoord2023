package en.codegym.task.pro.task09.task0914;

public class Solution {
    //Implement the changePath(String, String) method so that it replaces the jdk
    // version in the path passed in the first method parameter with the version
    // passed in the second parameter, and returns the new path.
    //The JDK version starts with "jdk" and ends at "/".

    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";
        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    //Implement the changePath(String, String) method so that it replaces the jdk
    // version in the path passed in the first method parameter with the version
    // passed in the second parameter, and returns the new path.
    //The JDK version starts with "jdk" and ends at "/".
    //The changePath(path, JDK version) method should return the path "/usr/java/jdk-13/bin".
    public static String changePath(String path, String jdk13) {
        if (path.contains(jdk13)) {

            String[] parts = path.split("/");
            parts[parts.length - 1] = jdk13;
            return String.join("/", parts);
        }
        return path;
    }
}