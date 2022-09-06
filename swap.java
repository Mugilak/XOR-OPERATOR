package xor_operator_examples;
import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b");
        int a=s.nextInt();
        int b=s.nextInt();
        A aa=new A();
        aa.swap(a, b);
     }
}
class A {
    public void swap(int a, int b){
        System.out.println("a = "+a+" ,b = "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = "+a+" ,b = "+b);
    }
    
}
