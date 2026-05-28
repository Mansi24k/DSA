import java.util.*;

public class Butterflypattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int row =1;
        // int star =1;
        // int spaces = n-1;
        // int star2=n;
        // int spaces2=0;

       
        // while (row<=n) {
        //     //print star1
        //     for(int i=1; i<=star; i++){
        //         System.out.print("* ");
        //     }

        //     //print spaces1
        //     for(int i=1; i<=spaces;i++){
        //         System.out.print("  ");
        //     }

        //     //print spaces2
        //     for(int i=1; i<=spaces; i++){
        //         System.out.print("  ");
        //     }

        //     //print star
        //     for(int i=1; i<=star; i++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        //     row++;
        //     star++;
        //     spaces--;
        // }

        // int row2=1;
        // while (row2<=n) {
        //     //print star1
        //     for(int i=1; i<=star2; i++){
        //         System.out.print("* ");
        //     }

        //     //print spaces1
        //     for(int i=1; i<=spaces2;i++){
        //         System.out.print("  ");
        //     }

        //     //print spaces2
        //     for(int i=1; i<=spaces2;i++){
        //         System.out.print("  ");
        //     }

        //     //print star
        //     for(int i=1; i<=star2; i++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        //     row2++;
        //     star2--;
        //     spaces2++;
        // }
    
        int row=1;
        int star=1;
        int spaces = n-2;

        while (row<=n) {
            //print star
            for(int i=1; i<=star;i++){
                System.out.print("* ");
            }

            //print spaces
            for(int i=1; i<=spaces;i++){
                System.out.print("  ");
            }

            //print star
            for(int i=1; i<=star;i++){
                System.out.print("* ");
            }

            //nextline
            System.out.println();
            if (row<n/2) {
                star++;
                spaces=spaces-2;
                row++;
            }else if (row == n/2) {
                row++;
            }else{
                star--;
                spaces=spaces+2;
                row++;
            }
        }

    }
}
