package se.iths.philip.project1.bil;

public class Car {
    private String brand;
    private String color;
    private double price;
    private int year;

    public Car(String brand, String color, double price, int year) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.year = year;

    }

    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void printInfo() {
        System.out.println("Märke: " + brand);
        System.out.println("Färg: " + color);
        System.out.println("Pris: " + price);
        System.out.println("Års model: " + year);

    }
}

