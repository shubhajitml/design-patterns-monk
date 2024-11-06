package LiskovSubstitutionPrinciple;

public class BiCycle implements Bike{

//    This would violate the behaviour of Parent class Bike, as it should turnOn the Engine rather than throwing an error
    @Override
    public void turnOnEngine(){
        throw new AssertionError("There is no Engine!");
    }

    @Override
    public void accelerate(){
        // increase the speed
    }
}
