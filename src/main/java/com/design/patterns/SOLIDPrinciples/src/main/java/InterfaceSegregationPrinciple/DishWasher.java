package InterfaceSegregationPrinciple;

public class DishWasher implements DishWasherInterface{
    @Override
    public void washDishes() {
        System.out.println("washing dishes");
    }
}
