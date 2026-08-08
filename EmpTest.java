//Documentation section
/*
    Program No.         : -
    Program Name.       : EmpTest.java
    Author              : Sreshta
    Date                : 29/07/2026
    Version             : Update 1
    Topics              : Classes and Objects
*/

// import section
import java.util.Scanner;

public class EmpTest
{
    // fields
    int id;
    String name;
    String department;
    double basic_salary;
    
    // constructor
    EmpTest(){
        this.id=99999;
        this.name="john doe";
        this.department="-";
        this.basic_salary=0.0;
    }
    EmpTest(int id, String name, String department, double basic_salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.basic_salary=basic_salary;
    }



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
        System.out.printf("Basic salary: %.1f \n",basic_salary);
        System.out.printf("Gross salary: %.1f \n",calculateGross());
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of employees: ");
        int n = sc.nextInt();

        System.out.print("Enter 1 to enter employee details or 0 to use default values: ");
        choice = sc.nextInt();

        System.out.println();

        // create an arr to store mmultiple employee details
        EmpTest emp[] = new EmpTest[n];

        if (choice==1){
            for(int i=0; i<n; i++)
            {
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
                emp[i] = new EmpTest(id, name, department, basic_salary);
            }
        }
        else{
            for(int i=0; i<n; i++)
            {
                emp[i] = new EmpTest();
            }
        }
        
        for(int i=0; i<n; i++)
        {
            emp[i].Display();
            System.out.println();
        }
    }
}