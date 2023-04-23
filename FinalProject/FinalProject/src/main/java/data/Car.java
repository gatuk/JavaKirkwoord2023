package data;

import java.time.LocalDate;

public class Car implements Comparable<Car> {
    //Make	Model	Price	Year	Kilometer	Seating_Capacity	sale_date	best_seller
    private String make;
    private String model;
    private double price;
    private int year;
    private int kilometer;
    private int seatCapacity;
    private LocalDate saleDate;
    private boolean bestSeller;
    //
    public Car(){
        make = "Unknown";
        model = "Unknown";
        price = 0;
        year = 0;
        kilometer = 0;
        seatCapacity = 0;
        saleDate = LocalDate.now();
        bestSeller = false;
    }

    public Car(String make, String model, double price, int year, int kilometer,
               int seatCapacity, LocalDate saleDate, boolean bestSeller) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.kilometer = kilometer;
        this.seatCapacity = seatCapacity;
        this.saleDate = saleDate;
        this.bestSeller = bestSeller;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        this.bestSeller = bestSeller;
    }
    @Override
    public int compareTo(Car o) {
        return this.make.compareTo(o.make);
    }
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", kilometer=" + kilometer +
                ", seatingCapacity=" + seatCapacity +
                ", saleDate=" + saleDate +
                ", bestSeller=" + bestSeller +
                '}';
    }
}
