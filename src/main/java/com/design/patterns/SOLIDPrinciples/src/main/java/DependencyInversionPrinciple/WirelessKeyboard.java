package DependencyInversionPrinciple;

public class WirelessKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("typing with wireless keyboard");
    }

    public void changeBattery(){
        System.out.println("Changing battery of wireless keyboard");
    }
}
