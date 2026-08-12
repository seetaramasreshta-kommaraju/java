import java.util.Scanner;

public class Invoice 
{
    // add instance variables
    String partNumber;
    String partDescription;
    int quantity;
    double price;

    Invoice()
    {
        partNumber = "100";
        partDescription = "No Description";
        quantity = 1;
        price = 10;

    }

    Invoice(String partNumber, String Description, int quantity, double price) 
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
        if (price > 0.0)
            this.price = price;
        else
            this.price = 0.0;
    }

    // add setters and getters
    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }
    
    public void setQuantity(int quantity)
    {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }
    
    public void setPrice(double price)
    {
        if (price > 0.0)
            this.price = price;
        else
            this.price = 0.0;
    }


    public String getPartNumber()
    {
        return this.partNumber;
    }

    public String getPartDescription()
    {
        return this.partDescription;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public double getPrice()
    {
        return this.price;
    }

    public double getInvoiceAmount()
    {
        return this.quantity * this.price;
    }

}

class ProgramNo13
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter part number: ");
    String partNumber = sc.nextLine();
    System.out.print("Enter part description: ");
    String partDescription = sc.nextLine();
    System.out.print("Enter quantity: ");
    int quantity = sc.nextInt();
    System.out.print("Enter price per item: ");
    double price = sc.nextDouble();

    Invoice i1 = new Invoice();
    System.out.println("==================== Item 1 Bill ===================");
    System.err.println("Part Number: "+i1.getPartNumber());
    System.err.println("Part Description: "+i1.getPartDescription());
    System.err.println("Part Quantity: "+i1.getQuantity());
    System.err.println("Part Price: "+i1.getPrice());
    System.out.println("Pay Invoice: "+i1.getInvoiceAmount());

    Invoice i2 = new Invoice(partNumber, partDescription, quantity, price);
    System.out.println("==================== Item 2 Bill ===================");
    System.err.println("Part Number: "+i2.getPartNumber());
    System.err.println("Part Description: "+i2.getPartDescription());
    System.err.println("Part Quantity: "+i2.getQuantity());
    System.err.println("Part Price: "+i2.getPrice());
    System.out.println("Pay Invoice: "+i2.getInvoiceAmount());
    
    }
}