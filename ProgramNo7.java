//Documentation section
/*
    Program No.         : 7
    Program Name.       : ProgramNo7.java
    Author              : Sreshta
    Date                : 13/07/2026
    Version             : Update 1
    Topics              : Input/Output Operations, Primitive Datatypes, Operators, Conditional Statements,
                          Loop Statements,Arrays in Java.
*/

// import section
import java.util.Scanner;

public class ProgramNo7{
    public int minCompartments(int r,int k,int[] arr){
        int required_food = r*k;
        for(int i=0;i<arr.length;i++){
            required_food -= arr[i];
            if(required_food <= 0){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ProgramNo7 p = new ProgramNo7();
        int r,k;
        System.out.print("Enter number of rats: ");
        r = sc.nextInt();
        System.out.print("Enter amount of food each rat needs: ");
        k = sc.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter the amount of food in each compartment: ");
        for(int i=0;i<r;i++){
            System.out.print("Enter food in compartment "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        int result = p.minCompartments(r,k,arr);
        if(result == -1){
            System.out.println("Not enough food in compartments.");
        }else{
            System.out.println("Minimum number of compartments needed: "+result);
        }
    }
}