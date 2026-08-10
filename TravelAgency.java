import java.util.Scanner;
public class TravelAgency 
{
    double rate;

    double calculateFare(double distance)
    {
        return distance * 15;
    }

    double calculateFare(double distance, int passengers)
    {
        return distance * 10 * passengers;
    }

    double calculateFare(double distance, String vehicleType, double tollCharge)
    {
        if (vehicleType.equalsIgnoreCase("SUV"))
            rate = 25;
        else if (vehicleType.equalsIgnoreCase("Sedan"))
            rate = 20;
        else
            rate = 15;
        return distance * rate + tollCharge;
    }
}

class ProgramNo12 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TravelAgency ta = new TravelAgency();

        System.out.print("Enter customer name: ");
        String customer_name = sc.nextLine();
        
        System.out.print("Enter distance: ");
        double distance = sc.nextInt();

        System.out.println();
        System.out.println("Choose Trip Type: ");
        System.out.println("1.Basic ride  2.Bus ride  3.Luxury ride");
        int choice = sc.nextInt();
        double fare = 0.0;

        if(choice == 1)
        {
            fare = ta.calculateFare(distance);
        }
        else if(choice == 2)
        {
            System.out.print("Enter number of passengers: ");
            int passengers = sc.nextInt();
            fare = ta.calculateFare(distance, passengers);
        }
        else if(choice == 3) 
        {
            System.out.print("Enter vehicle type (SUV/Sedan/Other): ");
            String vehicleType = sc.next();
            System.out.print("Enter toll charge: ");
            double tollCharge = sc.nextDouble();
            fare = ta.calculateFare(distance, vehicleType, tollCharge);
        }
        else 
        {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.println("-----------------Travel Summary------------------");
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Distance: " + distance);
        System.out.println("Fare: " + fare);
    }
}