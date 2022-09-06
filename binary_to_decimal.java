package xor_operator_examples;
import java.util.Scanner;
public class binary_to_decimal {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter binary digit : ");
        long n= s.nextLong();
        long temp= n;
        int i=0;
        long rem, mul, digits=0L;
        while(n>0){
            rem = n%10;
            mul = rem * (long)Math.pow(2,i);
            i++;
            digits = digits + mul ;
            n = n/10;
        }
        System.out.println(digits+" is a decimal of "+temp);
    }
}
