package SingleResponsibility;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        // Save into the DB
    }
}
