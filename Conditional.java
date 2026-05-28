/*  1. Finish the following code so that it prints You have a fever if your temperature is 
     above 100 and otherwise prints You don't have a fever.  */ 
 import java.util.*;
/*public class Conditional{
    public static void main(String[]args) {
        double temp = 103.5;
        if (temp>100) {
            System.out.println("You have a fever.");
        }
        else{
            System.out.println("You don't have a fever.");
        }
        }
        } */ 

/* 2. Write a Java program to input week number(1-7)and print day of week name using switch case.*/ 
 
 /*public class Conditional {
    public static void main (String args[]){
        int week_num ;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the week number: ");
        week_num = obj.nextInt();
        switch (week_num) {
            case 1: System.out.println("Sunday");
                     break;
            case 2: System.out.println("Monday");
                     break;
            case 3: System.out.println("Tuesday");
                     break;
            case 4: System.out.println("Wednesday");
                     break;
            case 5: System.out.println("Thursday");
                     break;
            case 6: System.out.println("Friday");
                     break;
            case 7: System.out.println("Saturday");
                     break;
            default:System.out.println("you did not enter the week number.");
                break;
        }
    }
    
 }*/ 

//  3.Write a Java program that takes a year from the user and print whether that year is a leap year or not.
public class Conditional {
    public static void main (String args[]){
        int year ;
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = obj1.nextInt();
        if (year%4==0) {
            System.out.println("It is a leap year.");
        }
        else{
            System.out.println("It is not a leap year.");
        }
    }
}