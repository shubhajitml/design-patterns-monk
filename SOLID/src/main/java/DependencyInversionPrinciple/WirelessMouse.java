package DependencyInversionPrinciple;

public class WirelessMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Clicking with wireless mouse");
    }

    public void changeBattery(){
        System.out.println("Changing battery of wireless mouse");
    }
}
