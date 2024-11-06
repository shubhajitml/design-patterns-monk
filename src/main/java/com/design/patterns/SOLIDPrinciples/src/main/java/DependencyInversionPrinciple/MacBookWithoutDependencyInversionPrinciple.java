package DependencyInversionPrinciple;

public class MacBookWithoutDependencyInversionPrinciple {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBookWithoutDependencyInversionPrinciple(){
        keyboard = new WiredKeyboard();
        mouse = new WiredMouse();
    }
}
