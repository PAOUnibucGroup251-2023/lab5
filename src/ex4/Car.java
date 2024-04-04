package ex4;

public class Car implements Vehicle{
    private int speed = 0;

    @Override
    public void activateAlarm(){
        System.out.println("Car activated alarm");
    }

    @Override
    public void deactivateAlarm() {
        System.out.println("Car deactivated alarm");
    }

    @Override
    public void accelerate() {
        speed++;
    }

    @Override
    public void brake() {
        speed--;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
    
    public static int calculateDistance(Car c, int time, int startingPoint){
        return c.getSpeed()*c.getSpeed()*time + startingPoint;
    }
}
