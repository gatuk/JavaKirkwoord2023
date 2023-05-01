package en.codegym.task.pro.task10.task1017;

import java.math.BigInteger;

/*
Creating the continents
*/
public class Earth {

    public void main(String[] args) {
        //write your code here
        int area = 100;
        Africa africa = new Africa(area);
        Antarctica antarctica = new Antarctica(area);
        Australia australia = new Australia(area);
        Eurasia eurasia = new Eurasia(area);
        NorthAmerica northAmerica = new NorthAmerica(area);
        SouthAmerica southAmerica = new SouthAmerica(area);
    }
}
