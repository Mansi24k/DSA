import java.util.*;

public class Wtwopattern {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       /* System.out.print("Enter any number: ");
        //cube pattern
      int n = sc.nextInt();

        int row=1;

        while (row<n) {
            if (row==1 || row == n-1) {
                for(int i =1; i<=n; i++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");

                for(int i=1; i<=n-2; i++){
                    System.out.print("  ");
                }

                System.out.print("* ");
            }

            System.out.println();
            row++;
        }*/

        //inverted and rotated half pyramid pattern

        /*System.out.print("Enter any number: ");
        int n = sc.nextInt();

        int row = 1;
        int spaces = n-1;
        int star = 1;

        while (row<=n) {
            //print spaces
            for(int i=1;i<=spaces;i++){
                System.out.print("  ");
            }
            //print stars
            for(int i=1;i<=star; i++){
                System.out.print("* ");
            }

            //next line 
            System.out.println();

            //decrease spaces value and increase star value and row value
            row++;
            spaces--;
            star++;
        }*/

        //inverted half-pyramid with number pattern
        /*System.out.print("Enter any number: ");
        int n = sc.nextInt();

        int row=1;
        int spaces=n-5;
        int star=n;

        while (row<=n) {
            //star print
            for(int num=1; num<=star;num++){
                System.out.print(num+" ");
            }

            //spaces print
            for(int i=1; i<=spaces;i++){
                System.out.print("  ");
            }

            //nextline and increase decreases
            System.out.println();
            row++;
            spaces++;
            star--;
        }*/

        //floyd's triangle pattern
       /*  System.out.print("Enter any number: ");
        int n = sc.nextInt();

        int number=1;
      
            //print star
            for(int num=1; num<=n; num++){
                for(int j=1;j<=num;j++){
                System.out.print(number+" ");
                number++;
                }
                System.out.println();
                 
            }*/

          

            //0 to 1 triangle pattern
            System.out.print("Enter any number: ");
            int n = sc.nextInt();

            
            int num =1;
            
             for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                 if((i+j)%2 !=0){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
            }
                System.out.println();

            }

    }
}