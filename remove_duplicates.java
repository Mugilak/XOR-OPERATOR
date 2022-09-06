package xor_operator_examples;
import java.util.Arrays;
import java.util.Scanner;
public class remove_duplicates {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n= s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        non_duplicates(arr);
    }
    public static void non_duplicates(int[] a){
        int[] visit = new int[a.length];
        Arrays.fill(visit, 0);
        for(int i=0;i<a.length;i++){
            if(visit[i] != -1){
                for(int j=i+1;j<a.length;j++){
                    if((a[i]^a[j]) == 0){
                        visit[j]=-1;
                        visit[i]=-1; 
                    }
                }   
            }
        }
        for(int i= 0;i<a.length;i++){
            if (visit[i] != -1) {
                System.out.print(a[i]+" ");
            }
        }
    }
}
