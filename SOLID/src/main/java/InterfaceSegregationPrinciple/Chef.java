package InterfaceSegregationPrinciple;

public class Chef implements ChefInterface{
    @Override
    public void cookFood() {
        System.out.println("cooking food");
    }

    @Override
    public void decideMenu() {
        System.out.println("deciding menu");
    }
}
