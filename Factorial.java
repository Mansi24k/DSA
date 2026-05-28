import java.util.*;;

public class Factorial {
  public static void main(String[] args){
    int fact=1;
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = Sc.nextInt();
    
    for(int i=number ; i> 0 ; i--){
        fact *= i;
    }
     System.out.println("Factorial of "+ number + " is:"+ fact);  
  }  
}
