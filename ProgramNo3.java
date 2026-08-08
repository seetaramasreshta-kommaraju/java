//Documentation section
/*
    Program No.         : 3
    Program Name.       : ProgramNo3.java
    Author              : Sreshta
    Date                : 08/07/2026
    Version             : Update 1
    Topics              : Input/Output Operations, Primitive Datatypes, Operators, Conditional Statements
*/

// import section
import java.util.Scanner;

public class ProgramNo3 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        // Input Operation
        System.out.print("Enter Employee Age: ");
        byte emp_age = sc.nextByte();

        System.out.print("Enter Years Of Experience: ");
        short experience = sc.nextShort();

        System.out.print("Enter Employee ID: ");
        int emp_id = sc.nextInt();

        System.out.print("Enter Anual Salary: ");
        long emp_salary = sc.nextLong();

        System.out.print("Enter Working Hours per Day: ");
        float working_hours = sc.nextFloat();

        System.out.print("Enter Annual Performance score: ");
        double annual_performance = sc.nextDouble();

        System.out.print("Enter Employee Grade: ");
        char emp_grade = sc.next().charAt(0);

        System.out.print("Enter Employee Permanent Status: ");
        boolean status = sc.nextBoolean();

        // Functionalities [Program Logic, Calculations and Business Logic]

        // Calculate the Monthly Working Hours
        float monthly_working_hours = working_hours * 22;

        // Check Bonus Eligibility
        String bonus_eligibility;
        if(annual_performance >= 92.0 && status){
            bonus_eligibility = "Eligible";
        }
        else{
            bonus_eligibility = "Not Eligible";
        }

        // Output Operations | Display All Employee Details
        System.out.println("========== Employee Details ==========");
        System.out.println("Employee Age            :" + emp_age);
        System.out.println("Experience              :" + experience);
        System.out.println("Employee ID             :" + emp_id);
        System.out.println("Employee Salary         :" + emp_salary);
        System.out.println("Working Hours / Day     :" + working_hours);
        System.out.println("Monthly Working Hours   :" + monthly_working_hours);
        System.out.println("Performance score       :" + annual_performance);
        System.out.println("Employee grade          :" + emp_grade);
        System.out.println("Permanent Employee      :" + status);
        System.out.println("Bonus Eligibility       :" + bonus_eligibility);
    }
}