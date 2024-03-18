package Array;
import java.util.*;

public class AtSpecificPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("enter element: ");        
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] arr1 = new int[n + 1];

        for (int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }

        System.out.print("enter index where you want to insert an element: ");
        int pos = sc.nextInt();

        System.out.print("enter element for inserting at " + pos + " position: ");
        int s = sc.nextInt();

        //shifting
        for (int i = n - 1; i >= pos; i--){
            arr1[i + 1]  = arr1[i];
        }

        arr1[pos] = s;

        System.out.print("new array: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
