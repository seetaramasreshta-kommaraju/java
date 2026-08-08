//Documentation section
/*
    Program No.         : 9
    Program Name.       : TrafficSystem.java
    Author              : Sreshta
    Date                : 29/07/2026
    Version             : Update 1
    Topics              : Classes and Objects
*/

// import section
import java.util.Scanner;

public class Employee
{
    // fields
    int id;
    String name;
    String department;
    double basic_salary;

    // methods
    void setData(int i, String n, String d, double b)
    {
        id = i;
        name = n;
        department = d;
        basic_salary = b;
    }

    double calculateHRA()
    {
        return (basic_salary * 0.20);
    }

    double calculateDA()
    {
        return (basic_salary * 0.10);
    }

    double calculateGross()
    {
        return (basic_salary + calculateHRA() + calculateDA());
    }

    void Display()
    {
        System.out.printf("Employee ID: %d \n",id);
        System.out.printf("Employee name: %s \n",name);
        System.out.printf("Department: %s \n",department);
        System.out.printf("Basic salary: %1.f \n",basic_salary);
        System.out.printf("Gross salary: %1.f \n",calculateGross());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of employees: ");
        int n = sc.nextInt();

        // create an arr to store mmultiple employee details
        Employee emp[] = new Employee[n];

        for(int i=0; i<n; i++)
        {
            emp[i] = new Employee();
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter department: ");
            String department = sc.nextLine();
            System.out.print("Enter salary: ");
            double basic_salary = sc.nextDouble();
            sc.nextLine();
            emp[i].setData(id,name,department,basic_salary);
        }

        for(int i=0; i<n; i++)
        {
            emp[i].Display();
            System.out.println();
        }
    }
}