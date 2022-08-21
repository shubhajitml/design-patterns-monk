package SingleResponsibility;

public class Invoice {
//    Invoice following the SingleResponsibility principle
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }
}
