package DependencyInversionPrinciple;

public class WiredMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Clicking with wired mouse");
    }

    public void connectToUsbPort(){
        System.out.println("Connecting to usb port of a machine with wired mouse");
    }}
