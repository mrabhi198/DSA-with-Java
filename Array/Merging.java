package Array;
import java.util.*;

public class Merging {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of array 1: ");
        int n = sc.nextInt();
        
        System.out.print("enter size of array 2: ");
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        int[] arr1 = new int[m];
        int[] arr2 = new int[arr.length + arr1.length];

        //array 1
        System.out.print("enter elements of array 1: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //array 2
        System.out.print("enter elements of array 2: ");
        for(int i = 0; i < m; i++){
            arr1[i] = sc.nextInt();
        }

        //merging array 1 and array 2        
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        for(int i = 0; i < arr1.length; i++){
            arr2[arr.length + i] = arr1[i];
        }

        //traversing array 3
        System.out.print("array after merging: ");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
