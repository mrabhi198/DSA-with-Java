package Array;
import java.util.*;

public class Beginning {
    // public static void insertBeg(int []arr, int n){
        
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];        //creating array

        //array input 
        System.out.println("Enter element: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Arrays: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //creating new array of size n + 1
        int[] arr1 = new int[n + 1];


        // System.out.println(arr1.length);
        for(int i = 0; i < arr.length; i++){
            arr1[i + 1] = arr[i];
        }

        System.out.println("Enter element for 1st index: ");
        int e = sc.nextInt();

        arr1[0] = e;
        // n = arr1.length;

        //new array 
        System.out.println("New array:");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        
    }
}
