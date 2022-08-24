package DependencyInversionPrinciple;

public class WiredKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("typing with wired keyboard");
    }

    public void connectToUsbPort(){
        System.out.println("Connecting to usb port of a machine with wired keyboard");
    }
}
