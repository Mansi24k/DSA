
//WHILE-LOOP

// 1. print 1 to 100 using while loop
import java.util.*; 

/*public class Loops {
    public static void main(String args[]){
        int num = 1;
        while(num<=10){
            System.out.println(num);
            num++;
        }
    }
}*/

// 2. print 1 to n using while loop
/*public class Loops {
    public static void main(String args[]){
        int num1=1 ,num2;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num2 = obj.nextInt();
        while(num1<=num2){
            System.out.println(num1);
            num1++;
        }
    }
}*/

// 3. print sum of first n natural number using while loop
/*public class Loops {
    public static void main(String args[]){
        int first_no =1,number,sum = 0;
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = obj1.nextInt();
        while(first_no <= number){
           sum += first_no;
           first_no++;
        }
        System.out.println("Sum of first "+number+" number is: "+ sum);
    }
}*/

// print reverse of number = 28679
/*public class Loops {
  public static void main(String args[]){
    int num =  28679;
    while(num>0){
        int lastdigit = num%10;
        System.out.print(lastdigit);//97682 reverse 
        num /= 10;
    }
  }
}*/


//FOR LOOP

//1. print square pattern using for loop.

/*public class Loops {
    public static void main(String args[]){
      int square ;
      for (square = 1;square<=4;square++){
        System.out.println("****");
      }
}
}*/

//DO-WHILE LOOP

//Print hello world 10 times.

/*public class Loops {
   public static void main(String args[]){
    int num = 1;
    do{
        System.out.println("Hello World!");
        num++;
    }while(num <= 10);
   }  
}*/

//keep entering number till user enters multiple of 10.
/*public class Loops {

   public static void main(String args[]){
    Scanner user = new Scanner(System.in);

    do{
        System.out.print("Enter the number: ");
        int number = user.nextInt();
        if (number % 10 ==0) {
            break;
        }
        System.out.println(number);
    }while(true);
    System.out.println("Entered number is multiple of 10.");
   }
}*/

// check number is prime or not

