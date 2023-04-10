package en.codegym.task.pro.task06.task0613;

public class Solution {
    public static String city = "Tokyo";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York City", 21.6);
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println("The population of " + Solution.city + " is " + Solution.population + " million.");
        System.out.println("But in the most populous city, " + Solution.city + ", the population is " + Solution.population + " million.");
    }
}


    /*
    The program should display the population of the largest cities in the world and compare them with Tokyo, the most populous city of all.
    But the program's algorithm is slightly broken.
    To correct the error, you need to make it so the line that displays
    information about the world's largest city uses static class variables instead of local method arguments.
    */

