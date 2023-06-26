// public class LinearSearch {
//     public static int linearSearch(int arr[], int key) {
//         for(int i = 0; i<arr.length; i++) {
//             if(arr[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int arr[] = {2, 5, 3, 6, 12, 25};
//         int key = 39;
//         System.out.println(linearSearch(arr, key));
        
//     }
// }
import java.util.*;
public class LinearSearch {
    public static int binary_Search(int arr[], int key) {
        int si = 0;
        int ei = arr.length-1;
        while(si<ei) {
            int mid = (si+ei)/2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid]<key) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {2, 4, 5, 6, 8, 11};  //4, 6, 11 - cond. fail?
        int key = 11;
        System.out.println(binary_Search(arr, key));
    }
}
