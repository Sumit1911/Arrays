import java.util.*;
public class PairArray {
    public static void printSubArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i; i<arr.length; j++) {
                // System.out.print("[");
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                // System.out.print("]");
            }
            System.out.println();
        }
    }
    // public static void printArray(int arr[]) {
    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=i+1; j<arr.length; j++) {
    //             System.out.print("(" + arr[i] + "," + arr[j] + ")");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        //printArray(arr);
        printSubArray(arr);
    }
}
