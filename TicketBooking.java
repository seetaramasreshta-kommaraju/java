//Documentation section
/*
    Program No.         : 10
    Program Name.       : TicketBooking.java
    Author              : Sreshta
    Date                : 29/07/2026
    Version             : Update 1
    Topics              : Objects, classes
*/

// import section
import java.util.Scanner;

public class TicketBooking
{
    // members
    int id;
    String name;
    int age;
    String movie;
    String theatre;
    double ticket_price;
    int no_of_tickets;
    double snacks_amount;
    int gst_percentage;
    double discount_amount;
    String seat_numbers[];
    int available_seats;
    int booked_seats;
    boolean payment_status;
    String movie_language;
    String payment_type;
    boolean membership_status;

    // methods
    void setData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Movie Name: ");
        movie = sc.nextLine();

        System.out.print("Enter Theatre Name: ");
        theatre = sc.nextLine();

        System.out.print("Enter Movie Language: ");
        movie_language = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        ticket_price = sc.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        no_of_tickets = sc.nextInt();
        sc.nextLine();

        seat_numbers = new String[no_of_tickets];

        System.out.println("Enter Seat Numbers:");
        for(int i = 0; i < no_of_tickets; i++)
        {
            System.out.print("Seat " + (i + 1) + ": ");
            seat_numbers[i] = sc.nextLine();
        }

        System.out.print("Enter Snacks Amount: ");
        snacks_amount = sc.nextDouble();

        System.out.print("Enter GST Percentage: ");
        gst_percentage = sc.nextInt();

        System.out.print("Enter Discount Amount: ");
        discount_amount = sc.nextDouble();

        System.out.print("Enter Available Seats: ");
        available_seats = sc.nextInt();

        booked_seats = no_of_tickets;

        sc.nextLine();

        System.out.print("Enter Payment Type (Cash/Card/UPI): ");
        payment_type = sc.nextLine();

        System.out.print("Payment Successful? (true/false): ");
        payment_status = sc.nextBoolean();

        System.out.print("Membership Available? (true/false): ");
        membership_status = sc.nextBoolean();
    }

    void display()
    {
        
    }

    public static void main(String[] args)
    {
        
    }
}