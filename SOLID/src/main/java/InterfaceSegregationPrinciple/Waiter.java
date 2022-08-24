package InterfaceSegregationPrinciple;

public class Waiter implements WaiterInterface{
    @Override
    public void serveCustomers() {
        System.out.println("serving customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("taking orders");
    }
}
