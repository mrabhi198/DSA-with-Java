package Array;
import java.util.*;

public class DeletionAtSpecific {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        //creating new array
        int[] arr1 = new int[n - 1];
        int[] temp = new int[1];

        System.out.print("enter index which you want to delete: ");
        int pos = sc.nextInt();

        temp[0] = arr[pos];

        for (int i = 0; i < pos; i++){
            arr1[i] = arr[i];
        }

        //shifting
        for (int i = pos; i < arr1.length; i++){
            arr1[i] = arr[i + 1];
        }

        System.out.print("new array: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
