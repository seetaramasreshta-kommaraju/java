import java.util.*;

interface Square{
    int findSquare(int n);
}

class SquareImpl implements Square{
    @Override 
    public int findSquare(int n){
        return n*n;
    }
}

public class WithoutLambda {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its square: ");
        int x = sc.nextInt();
        Square s = new SquareImpl();
        System.out.println("Square of "+ x +" is: "+s.findSquare(x));
    }
}
