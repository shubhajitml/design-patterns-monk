package OpenClosed;

public class InvoiceDaoWithoutOpenClosedPrinciple {
    Invoice invoice;

    public InvoiceDaoWithoutOpenClosedPrinciple(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        // Save into the DB
    }

    public void saveToFile(String fileName){
        // Save invoice to File with the given name
    }
}
