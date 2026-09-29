import java.util.*;

interface Square{
    int findSquare(int n);
} 

public class WithLambda {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its square: ");
        int x = sc.nextInt();
        Square s = n -> n*n;
        System.out.println("Square of "+ x +" is: "+s.findSquare(x));
    }
}