//User input in java
import java.util.*;

public class Input {
    public static void main(String args[]){
     int a,b,c;
     Scanner S = new Scanner(System.in);
     System.out.print("Enter the value of a:"+" ");
     a = S.nextInt();
     System.out.print("Enter the value of b:"+" ");
     b = S.nextInt();
     c = a+b;
     System.out.print("Sum of a and b is :"+" "+c);
    }
}
