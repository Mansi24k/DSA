import java.util.*;



     public class Function {

     //product of two number  
    public static int product(int a, int b){
     int result = a*b;
     return result;
    }
    
    //factorial of a given number
    public static int fact(int a){
        int fact = a;
        int num = 1;
        for(int i=1; i<=fact; i++){
             num = num * i;
        }
        return num;
    }

    //Binomial coefficient
    public static int bicoff(int n, int r){
    int fact_n = fact(n);
    int fact_r = fact(r);
    int fact_nmr = fact(n-r);
    int result = fact_n / (fact_r*fact_nmr);
    return result;
    }

   public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    /*System.out.print("Enter first number: ");
    int num1 = user.nextInt();
    System.out.print("Enter Second number: ");
    int num2 = user.nextInt();
    int product = product(num1, num2);
    System.out.println("product of given number is: "+ product);

    System.out.print("Enter Any number for factorial: ");
    int num3 = user.nextInt();
    int result = fact(num3);
    System.out.println("factorial of given number "+num3+" is: "+ result);*/

    System.out.print("enter the value of n: ");
    int n = user.nextInt();
    System.out.print("enter the value of r: ");
    int r = user.nextInt();
    int fact_result = bicoff(n, r);
    System.out.println("the given value's binomial coefficient is: "+ fact_result);
   } 
}
