import java.util.Scanner;

public class Nestedforloop {
    public static void main (String arg[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter how many lines you want: ");
        // int user = sc.nextInt();

        // for(int line = user;line>=1; line--){
        //     for(int star=line; star>=1; star--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
    // }

        // Scanner A = new Scanner(System.in);
        // System.out.print("enter how many lines you want:  ");
        // int user = A.nextInt();
        // for(int num=1; num<=user; num++){
        //     for(int j=1; j<=num; j++){
        //     System.out.print(j);
        // }
        // System.out.println();
        // }
        
        char ch='A';
        Scanner B = new Scanner (System.in);
        System.out.print("enter how many lines you want: ");
        int user = B.nextInt();
        for(int line=1; line<=user; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
