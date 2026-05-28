import java.util.Scanner;

public class primefunction {

    public static boolean isPrime(int n){
        if (n == 2) {
            return true;
        }

        for(int i=2; i<= n-1; i++){
            if(n%i==0){
                return false;
            }
            }
            return true;
    }

    public static void primesinrange(int n){
        for(int i=2; i<=n ; i++){
            if(isPrime(i)){ //if statement is true then only it will return prime number if it is false then it will not return anything bcoz we don't put else part here which is for false block.
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


    public static void main(String args[]){
        primesinrange(16);
    }
}
