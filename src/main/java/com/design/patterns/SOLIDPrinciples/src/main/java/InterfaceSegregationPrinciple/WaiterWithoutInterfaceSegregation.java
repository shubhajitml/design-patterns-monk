package InterfaceSegregationPrinciple;

public class WaiterWithoutInterfaceSegregation implements ResturantEmployeeWithoutInterfaceSegregation{
    @Override
    public void washDishes() {
        // not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("serving customers!");
    }

    @Override
    public void cookFood() {
        // not my job
    }
}
