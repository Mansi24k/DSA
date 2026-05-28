import java.util.*;

public class Diamond {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();

        // int row=1;
        int spaces = (n/2)-1;
        int star=1;

        for(int row=1; row<=n; row++){
            //print spaces
            for(int i =1; i<=spaces; i++){
                        System.out.print("  ");
                    }

            //print stars
            for(int i=1; i<=star;i++){
                        System.out.print("* ");
                    }
                    System.out.println();
            if (row<n/2) {
            spaces--;
            star= star+2; 
            } else if (row == n/2) {      
            }else{
                spaces++;
                star= star-2;  
            }
        }
        // while (row<=n) {
        //     //print spaces
        //     for(int i =1; i<=spaces; i++){
        //         System.out.print("  ");
        //     }

        //     //print stars
        //     for(int i=1; i<=star;i++){
        //         System.out.print("* ");
        //     }

        //     //nextline
        //     System.out.println();
        //     if (row<n/2) {
        //     row++;
        //     spaces--;
        //     star= star+2; 
        //     } else if (row == n/2) {
        //         row++;
        //     }else{
        //         spaces++;
        //         star= star-2;
        //         row++;
        //     }
           
        // }

    }
}
