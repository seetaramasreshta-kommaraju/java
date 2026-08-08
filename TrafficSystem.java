//Documentation section
/*
    Program No.         : 8
    Program Name.       : TrafficSystem.java
    Author              : Sreshta
    Date                : 25/07/2026
    Version             : Update 1
    Topics              : Classes and Objects
*/

// import section
import java.util.Scanner;

public class TrafficSystem
{
    // 1.Fields (data members)
    String signalName;
    int vehicleCount;
    boolean emergencyVehicle;
    String trafficDensity;
    int signalTimer;

    // 2.Methods (behaviours)
    void setData()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter signalName: ");
        signalName = sc.nextLine();

        System.out.print("Enter vehicle count: ");
        vehicleCount = sc.nextInt();

        System.out.print("Enter emergency vehicle status (true/false): ");
        emergencyVehicle = sc.nextBoolean();

        System.out.print("Enter traffic density (High/Low): ");
        trafficDensity = sc.next();

        System.out.print("Enter signal timer: ");
        signalTimer = sc.nextInt();
    }

    void displayData()
    {
        System.out.println("===== 🚦Traffic Signal Data🚦 =====");
        System.out.println("Signal Name:       " + signalName);
        System.out.println("Vehicle Count:     " + vehicleCount);
        System.out.println("Emergency Vehicle: " + emergencyVehicle);
        System.out.println("Traffic Density:   " + trafficDensity);
        System.out.println("Signal Timer:      " + signalTimer);
    }

    void checkTrafficDensity()
    {
        if(vehicleCount>50){
            System.out.println("Heavy Traffic is Detected");
        } else {
            System.out.println("Normal Traffic");
        }
    }

    void checkEmergency()
    {
        if(emergencyVehicle){
            System.out.println("Emergency Vehicle Detected!");
            System.out.println("Emergency vehicle priority activated");
            System.out.println("Signal changes to GREEN");
            signalTimer += 10;
        } else {
            System.out.println("No Emergency Vehicle Detected.");
        }
    }

    void checkSignal()
    {
        if(trafficDensity.equalsIgnoreCase("High")){
            System.out.println("Traffic Density is High!!!");
            System.out.println("Signal reamains unchanged: GREEN");
        } else {
            System.out.println("Traffic Density is Low!!!");
            System.out.println("Signal changes: RED");
        }
    }

    public static void main(String[] args)
    {
        TrafficSystem ts = new TrafficSystem();
        ts.setData();
        ts.displayData();
        ts.checkTrafficDensity();
        ts.checkEmergency();
        ts.checkSignal();
    }
}

