import java.util.Scanner;
public class ProgramNo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // input
        System.out.print("Enter Quantity of Items Purchased: ");
        byte quantity = sc.nextByte();

        System.out.print("Enter Unit Price per Item: ");
        int price = sc.nextInt();
        
        System.out.print("Enter Tax Rate: ");
        float tax = sc.nextFloat();

        System.out.print("Enter Payment amount in USD: ");
        double usd = sc.nextDouble();
        
        System.out.print("Enter USD to INR Conversion Rate: ");
        float conversion_rate = sc.nextFloat();
        
        // logic
        int base_amount = quantity * price;
        float tax_amount = base_amount * tax;
        double total_amount = base_amount + tax_amount;
        double inr_amount = usd * conversion_rate;

        

        // output
        System.out.println("Base Amount         : " + base_amount);
        System.out.println("Tax Amount          : " + tax_amount);
        System.out.printf("Total Amount        : %.2f\n" , total_amount);
        System.out.printf("Total Amount in INR : %.2f\n" , inr_amount);


        if (inr_amount >= total_amount){
            System.out.println("Payment Status      : Payment Sufficient");
            System.out.println("Change              : " + (inr_amount - total_amount));
            System.out.printf("Need                : %.2f\n",0.0);
        }
        else{

            System.out.println("Payment Status      : Payment Insufficient");
            System.out.printf("Need                : %.2f\n", (total_amount - inr_amount));
        }

        sc.close();
    }
}