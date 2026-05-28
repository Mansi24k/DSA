public class Binarytodecimal {
    
    public static void bitodec(int binnum){
        int pow =0;
        int decnum = 0;
        while (binnum >0) {
            int lastNum = binnum % 10;
            decnum = decnum + lastNum * (int) Math.pow(2, pow); //typecasting bcoz pow take argument has double
            pow++;
            binnum = binnum/10;
        }
        System.out.println(decnum);
    }
    public static void main(String args[]){
        bitodec(111);
    }
}
