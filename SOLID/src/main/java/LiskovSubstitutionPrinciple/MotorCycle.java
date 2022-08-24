package LiskovSubstitutionPrinciple;

public class MotorCycle implements Bike{
    boolean isEngineOn = false;
    int speed = 0;

    @Override
    public void turnOnEngine(){
        // Turn on the Engine
        isEngineOn = true;
    }

    @Override
    public void accelerate(){
        // increase the speed
        speed += 10;
    }
}
