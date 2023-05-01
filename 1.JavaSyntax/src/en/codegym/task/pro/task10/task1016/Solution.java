package en.codegym.task.pro.task10.task1016;

/* 
Weather forecast
*/

public class Solution {

    public static void showWeather(City city) {
        //write your code here
        System.out.println("Today's temperature in "+ city.getName() + " is " + city.getTemperature());

    }

    public static void main(String[] args) {
        //write your code here
        City city = new City("Hanoi", 30);
        showWeather(city);
    }
}
