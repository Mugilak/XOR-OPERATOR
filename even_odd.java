package xor_operator_examples;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a ");
        int a=s.nextInt();
        even_od(a);
    }
    public static void even_od(int n){
        if((n&1)==1){
            System.out.println(n+" is Odd");
        }
        else{
            System.out.println(n+" is Even");
        }
    }
}
