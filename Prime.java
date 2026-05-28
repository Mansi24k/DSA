import java.util.*;


public class Prime {
   public static void main (String[]args){
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    num = sc.nextInt();

    boolean isPrime = true;
    
    if (num == 2)
    {
        System.out.println(num +" is prime");
    }
    else
    {
        for(int i=2; i<= num-1 ; i++)
        {
            if(num%i == 0){
             isPrime = false;
            }
         }
     
         if(isPrime == true){
             System.out.println(num+" is prime");
         }
         else
         {
             System.out.println(num+" is not prime");
         }
    }
   
   } 
}
