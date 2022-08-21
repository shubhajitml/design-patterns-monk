package SingleResponsibility;

public class InvoiceWithoutSingleResponsibility {
//    Invoice class has many reasons to change:
//       change in price calculation logic || invoice printing logic || data saving logic i.e. save to file / another DB
    private Marker marker;
    private int quantity;

    public InvoiceWithoutSingleResponsibility(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }

    public void printInvoice(){
        // print the invoice
    }

    public void saveToDB(){
        // save data into DB
    }
}
