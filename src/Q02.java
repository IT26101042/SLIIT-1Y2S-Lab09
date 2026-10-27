package Q02;

// a)
interface Printable {
    void printDetails();
}

// b)
class Report implements Printable {
    // c)
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // d)
    @Override
    public void printDetails() {
        System.out.println("----- Report -----");
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }
}

// b)
class Invoice implements Printable {
    // c)
    private String invoiceId;
    private double amount;

    public Invoice(String invoiceId, double amount) {
        this.invoiceId = invoiceId;
        this.amount = amount;
    }

    // d)
    @Override
    public void printDetails() {
        System.out.println("----- Invoice -----");
        System.out.println("Invoice ID: " + invoiceId);
        System.out.printf("Amount: Rs. %.2f%n", amount);
    }
}

public class Q02 {
    public static void main(String[] args) {
        // e)
        Report report1 = new Report("Sales Report", "Monthly sales increased.");
        Report report2 = new Report("Stock Report", "Available stock: 150 items.");

        Invoice invoice1 = new Invoice("INV001", 2500);
        Invoice invoice2 = new Invoice("INV002", 4800);


        Printable[] items = {report1, report2, invoice1, invoice2};

        
        for (Printable item : items) {
            item.printDetails();
            System.out.println();
        }
    }
}