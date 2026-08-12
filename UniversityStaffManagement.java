
class staff
{
    String staffId;
    String staffName;
    double baseSalary;

    staff()
    {
        staffId = "su100";
        staffName = "guest";
        baseSalary = 10000;
    }

    staff(String staffId, String staffName, double baseSalary)
    {
        this.staffId = staffId;
        this.staffName = staffName;
        this.baseSalary = baseSalary;
    }

    void display()
    {
        System.out.println("Staff ID: "+staffId);
        System.out.println("Staff Name: "+staffName);
        System.out.println("Base Salary: "+baseSalary);
    }
}

class teachingStaff extends staff
{
    String subjectName; 
}