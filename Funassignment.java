import java.util.*;

public class Funassignment {
    //average of three number.
    public static void Avg(int a, int b, int c){
        int Avg = (a+b+c)/3;
        System.out.println("the average of three numbers "+a+" "+b+" "+c+" is:"+ Avg);
    }

    //Even number program
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    // palindrome number or not
    public static void isPalindrome(int n){
        int myNum = n;
        int reverse = 0;
        
        while (myNum>0) {
           int lastDigit = myNum % 10;
           reverse = reverse*10+lastDigit;
           myNum =  myNum/10;
           }
           
           if (n == reverse) {
            System.out.println("the number "+n+" is palindrome number.");
           }
           else{
            System.out.println("the number "+n+" is not a palindrome number.");
           }
           
         }

         //math class java

         //for max and min, pow
         public static void mathclass(int a, int b){
            int maxno = Math.max(a, b);
            int minno =  Math.min(a, b);
            int powno = (int)Math.pow(a, b);
            System.out.println("maximum number is: "+maxno);
            System.out.println(("minimum number is: "+minno));
            System.out.println(("a power of b is: "+powno));
         }

         //for absolute and sqrt
         public static void mathclass(int x){
            double sqroot = Math.sqrt(x);
            int absolute = Math.abs(x);
            System.out.println("the square root of given no is: "+sqroot);
            System.out.println("the absolute value of given no is: "+absolute);
         }

         //for average
        //  public static void mathclass(int p, int q, int r){
        //     int avg = Math.avg(p,q,r);
        //  }


        //for sum from last number

        public static void sumint(int number){
            int mynum = number;
            int sum = 0;

            while (mynum != 0) {
                int lastDigit = mynum%10;
                sum = sum+lastDigit;
                mynum = mynum/10;
            }
            System.out.println("the sum of number "+ number+" is: "+sum);
        }
    



    public static void main(String args[]){
        Scanner userinput = new Scanner(System.in);
        //average number program

        /*System.out.print("Enter First Number: ");
        int a = userinput.nextInt();
        System.out.print("Enter Second Number: ");
        int b = userinput.nextInt(); 
        System.out.print("Enter Third Number: ");
        int c = userinput.nextInt(); 
        Avg(a,b,c);*/

        //even number program

        /*System.out.print("enter the number: ");
        int num = userinput.nextInt();
        boolean result = isEven(num);
        if(result==true){
            System.out.println("the given number is "+result+" so it is even.");
        }
        else{
            System.out.println("the given number is "+result+" so it is odd.");
        }*/



        /*System.out.println("enter the number: ");
        int num2 = userinput.nextInt();
        isPalindrome(num2);*/

        //math class
        /*System.out.print("enter first number: ");
        int num3 = userinput.nextInt();
        System.out.print("enter Second number: ");
        int num4 = userinput.nextInt();

        mathclass(num3, num4);
        mathclass(num3);*/

        //sum from last number of given integer number
        System.out.print("Enter integer number: ");
        int num5 = userinput.nextInt();
        sumint(num5);
    
    }
}
