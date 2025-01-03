package A2ZDSA;
import java.util.*;

public class SecLargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        // int secMax = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= max){
                max = arr[i];
                
                // if (arr[i] > secMax && arr[i] < max){
                //     secMax = arr[i];
                // }
            }
        }
        System.out.println("max is " + max);

        // int secMax = arr[0];
        for (int i = 0; i < arr.length - 1; i++){
            if ( arr[i] < max && arr[i] != max){
                int secMax = arr[i];
            }
        }

        System.out.println("second max is " + secMax);
    }
}
