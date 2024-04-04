package ex3;

import java.util.Arrays;

public class CarRunner {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        cars[0] = new Car("Honda", 1998, 900, 700);
        cars[1] = new Car("BMW", 2008, 1900, 800);
        cars[2] = new Car("Mercedes", 1989, 900, 700);

        Arrays.sort(cars);

        for(Car c: cars){
            System.out.println(c);
        }
    }
}
