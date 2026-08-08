//Documentation section
/*
    Program No.         : 6
    Program Name.       : ProgramNo6.java
    Author              : Sreshta
    Date                : 13/07/2026
    Version             : Update 1
    Topics              : Input/Output Operations, Primitive Datatypes, Operators, Conditional Statements,
                          Loop Statements,Arrays in Java.
*/

// import section
import java.util.Scanner;

public class ProgramNo6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        int[] marks = new int[100];
        double sum=0,mean,sd=0;
        int[] count = new int[10];
        
        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        System.out.println("Enter test Scores:  ");
        for(int i=0;i<n;i++){
            System.out.print("Enter marks of student "+(i+1)+": ");
            marks[i] = sc.nextInt();
            sum+=marks[i];
        }
        mean = sum/n;
        for(int i=0;i<n;i++){
            sd += Math.pow((marks[i]-mean),2);
        }
        sd = Math.sqrt(sd/n);
        // Score Distribution
        for(int i=0;i<n;i++){
            if(marks[i]<10)
                count[0]++;
            else if(marks[i]<20)
                count[1]++;
            else if(marks[i]<30)
                count[2]++;
            else if(marks[i]<40)
                count[3]++;
            else if(marks[i]<50)
                count[4]++;
            else if(marks[i]<60)
                count[5]++;
            else if(marks[i]<70)
                count[6]++;
            else if(marks[i]<80)
                count[7]++;
            else if(marks[i]<90)
                count[8]++;
            else
                count[9]++;
        }

        System.out.printf("\nThe mean of the marks is: %.2f", mean);
        System.out.printf("\n The standard deviation of the marks is %.2f\n\n", sd);

        System.out.println("Score Distribution: ");
        System.out.printf("<10: %.2f%%\n", count[0]*100.0/n);
        System.out.printf("10-19: %.2f%%\n", count[1]*100.0/n);
        System.out.printf("20-29: %.2f%%\n", count[2]*100.0/n);
        System.out.printf("30-39: %.2f%%\n", count[3]*100.0/n);
        System.out.printf("40-49: %.2f%%\n", count[4]*100.0/n);
        System.out.printf("50-59: %.2f%%\n", count[5]*100.0/n);
        System.out.printf("60-69: %.2f%%\n", count[6]*100.0/n);
        System.out.printf("70-79: %.2f%%\n", count[7]*100.0/n);
        System.out.printf("80-89: %.2f%%\n", count[8]*100.0/n);
        System.out.printf("90-100: %.2f%%\n", count[9]*100.0/n);

        sc.close();
    }
}