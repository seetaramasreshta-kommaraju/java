//Documentation section
/*
    Program No.         : -
    Program Name.       : StringTest.java
    Author              : Sreshta
    Date                : 5/08/2026
    Version             : Update 1
    Topics              : Strings
*/

// import section

public class StringTest
{
    public static void main(String args[])
    {
        // 1. String literal
        String trainName = "Vande Bharat Express";

        // 2. String object thru new keyword
        String passengerName = new String("Sreshta");

        // 3. array of characters
        char[] source = {'V','i','j','a','y','a','w','a','d','a'};
        String sourceStation = new String(source);

        // 4. string arr thru byte array
        byte[] destination = {'H','y','d','e','r','a','b','a','d'};
        String destinationStation = new String(destination);

        StringBuffer ticketStatus = new StringBuffer("Confirmed");

        char ch1 = trainName.charAt(0);
        int i = trainName.indexOf('B');
        int len = trainName.length();


        System.out.println("Train Name:             "+trainName);
        System.out.println("Passenger Name:         "+passengerName);
        System.out.println("Source Station:         "+sourceStation);
        System.out.println("Destination Station:    "+destinationStation);
        System.out.println("Ticket Status:          "+ticketStatus);
    }
}