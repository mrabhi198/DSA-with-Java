package Array;
import java.util.*;

public class AtTheEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //size of array
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        //creating array
        int[] arr = new int[n];

        //input elements in the array
        System.out.print("enter elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //traversing array
        System.out.print("Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //creating new array of size n+1
        int[] arr1 = new int[n + 1];

        //copying first n element to new array
        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }

        //taking element for last index
        System.out.print("enter element for last position: ");
        int l = sc.nextInt();

        //inserting element at the end
        arr1[n] = l;

        //traversing new array
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        // System.out.println(arr1[n - 2]);
    } 
}
