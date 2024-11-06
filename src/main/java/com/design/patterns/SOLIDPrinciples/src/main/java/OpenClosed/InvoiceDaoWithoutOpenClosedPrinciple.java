package OpenClosed;

public class InvoiceDaoWithoutOpenClosedPrinciple {
    Invoice invoice;

    public InvoiceDaoWithoutOpenClosedPrinciple(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        // Save into the DB
    }

//  It was a well tested production code, adding the following method [ saveToFile() ] would result in many bugs,
//  thus violating the principle
    public void saveToFile(String fileName){
        // Save invoice to File with the given name
    }
}
