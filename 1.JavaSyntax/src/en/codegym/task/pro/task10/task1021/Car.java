package en.codegym.task.pro.task10.task1021;

/* 
Car manufacturer
*/

public class Car {
    private String model;
    private int year;
    private String color;

    //write your code here
    /*
    create an initialize method that initializes a Car object's fields:
    model, year of manufacture, and color.
     */
    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
