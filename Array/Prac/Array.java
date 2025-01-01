package Array.Prac;
import java.util.*;

public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        // for(int i : arr){
        //     arr[i] = sc.nextInt();
        // }
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // for (int i : arr){
        //     System.out.println(arr[i]);
        // }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}