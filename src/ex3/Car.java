package ex3;

import java.util.Objects;

public class Car implements Comparable{
    private String make;
    private int year;
    private double price;
    private double emissions;


    public Car(String make, int year, double price, double emissions) {
        this.make = make;
        this.year = year;
        this.price = price;
        this.emissions = emissions;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(price, car.price) == 0 && Double.compare(emissions, car.emissions) == 0 && Objects.equals(make, car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, year, price, emissions);
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Car)) { return -1; }
        if (make.compareTo(((Car) o).make) < 0) return -1;
        else if (make.compareTo(((Car) o).make) > 0) return 1;
        else if (Double.compare(year, ((Car) o).year) > 0) return -1;
        else if (Double.compare(year, ((Car) o).year) < 0) return 1;
        else if (Double.compare(price, ((Car) o).price) < 0) return -1;
        else if (Double.compare(price, ((Car) o).price) > 0) return 1;
        else if (Double.compare(emissions, ((Car) o).emissions) < 0) return -1;
        else if (Double.compare(emissions, ((Car) o).emissions) > 0) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", emissions=" + emissions +
                '}';
    }
}
