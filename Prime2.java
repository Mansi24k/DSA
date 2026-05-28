import java.util.*;

public class Prime2 {
   public static void main (String[] args)
   {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = Sc.nextInt();
    
    boolean isPrime = true;

    if(num == 2){
        System.out.println(num + " is prime");
    }
    else
    {
        for(int i=2; i < Math.sqrt(num)-1; i++)
        {
            if(num%i == 0)
            {
               isPrime = false;
            }
        }
    
        if(isPrime == true)
        {
            System.out.println(num+ " is prime");
        }
        else
        {
            System.out.println(num + " is not prime");
        }
    }
    
   } 
}
