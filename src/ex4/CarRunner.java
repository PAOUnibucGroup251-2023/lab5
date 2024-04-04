package ex4;

public class CarRunner {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.deactivateAlarm();
        car.accelerate();
        int position = Vehicle.calculateDistance(car, 3, 0);
        System.out.println("Car position: " + position);
        car.accelerate();
        position = Vehicle.calculateDistance(car, 10, position);
        System.out.println("Car position: " + position);
        car.accelerate();
        position = Vehicle.calculateDistance(car, 7, position);
        car.brake();
        System.out.println("Car position: " + position);
        car.activateAlarm();
    }
}
