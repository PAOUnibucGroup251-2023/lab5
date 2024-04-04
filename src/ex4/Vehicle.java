package ex4;

public interface Vehicle {

    default void activateAlarm(){
        System.out.println("Activate Alarm");
    }

    default void deactivateAlarm(){
       System.out.println("Deactivate Alarm");
    }

    void accelerate();
    void brake();
    int getSpeed();

    static int calculateDistance(Vehicle v, int time, int startingpoint) {
        return startingpoint + v.getSpeed() * time;
    }

}
