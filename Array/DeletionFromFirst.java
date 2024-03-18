package Array;

import java.util.Scanner;

public class DeletionFromFirst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size: ");
        int n = sc.nextInt();

        //creating array
        int[] arr = new int[n];

        //input elements
        System.out.print("enter elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //traversing
        System.out.print("array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        //creating new array
        int[] arr1 = new int[n - 1];

        //shifting
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = arr[i + 1];
        }

        //traversing new array
        System.out.print("new array: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
