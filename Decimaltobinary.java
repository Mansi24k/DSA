public class Decimaltobinary {
    
    public static void dectobin(int n){
        int mynum = n;
        int pow =0;
        int binum = 0;

        while (n>0) {
            int rem = n%2;
            binum = binum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("the binary form of "+mynum+" is: "+ binum);
    }
    public static void main(String args[]){
        dectobin(11);
    }
}
