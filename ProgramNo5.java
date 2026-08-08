//Documentation section
/*
    Program No.         : 5
    Program Name.       : ProgramNo5.java
    Author              : Sreshta
    Date                : 10/07/2026
    Version             : Update 1
    Topics              : Input/Output Operations, Primitive Datatypes, Operators, Conditional Statements,
                          Loop Statements,Arrays in Java.
*/

// import section
import java.util.Scanner;

public class ProgramNo5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size+1];
        // Read array elements from user input
        for(int i=0;i<size;i++){
            System.out.print("Enter element " + (i) + ": ");
            arr[i] = sc.nextInt();
        }
        // Display the array elements before adding the new element
        System.out.println("The array elements before adding the new element are: ");
        for(int i=0;i<size;i++){
            System.out.println("Element " + (i) + ": " + arr[i]);
        }


        
        // Add a new element to the array
        System.out.print("Enter the new element to add to the array: ");
        int value = sc.nextInt();
        System.out.print("Enter the index for inserting the new element: ");
        int index = sc.nextInt();
        // Shifting elements
        for (int i=size-1;i>index;i--){
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        // Display the array elements after adding the new element
        System.out.println("The array elements after adding the new element are: ");
        for(int i=0;i<size+1;i++){
            System.out.println("Element " + (i) + ": " + arr[i]);
        }



        // Delete an element from the array
        System.out.print("Enter the index of the element to delete from the array: ");
        int deleteIndex = sc.nextInt();
        // Shifting elements to delete the element
        for (int i=deleteIndex;i<size;i++){
            arr[i] = arr[i+1];
        }
        // Display the array elements after deleting the element
        System.out.println("The array elements after deleting the element are: ");
        for(int i=0;i<size;i++){
            System.out.println("Element " + (i) + ": " + arr[i]);
        }



        // Search for an element in the array
        System.out.print("Enter the element to search in the array: ");
        int search_val = sc.nextInt();
        boolean found = false;
        for(int i=0;i<size;i++){
            if(arr[i] == search_val){
                System.out.println("Element " + search_val + " found at index " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}
