package xor_operator_examples;
import java.util.Scanner;
public class decimal_to_binary {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter decimal value : ");
        int n= s.nextInt();
        int temp= n;
        int rem, i= 1,digits=0;
        while(n>0){
            rem = n%2;
            digits = i * rem + digits;
            i*=10;
            n = n/2;
        }
        System.out.println(digits+" is binary digit of "+temp);
    }
}
