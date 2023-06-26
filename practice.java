import java.net.SocketTimeoutException;
import java.util.*;
import java.util.Arrays;
public class practice {

    public static void main(String args[]) {
        
        int nums[] = {1, 3, 5, 6};
        int target = 7;
        System.out.println(sear(nums, target));
    }
    public static int sear(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start<end) {
            int mid = (start+end)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                start = start+1;
            } else {
                end = end -1;
            } 
        } 
        if(start+end > nums.length) {
            return end++;
        } else {
            return start++;
        }
    }
    
      
    // public static int index(int arr[], int target) {
    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=i+1; j<arr.length; j++) {
    //             if((arr[i]+arr[j])==target) {
    //             return{i, j};
    //             }
    //         }
    //     }
    //      return -1;
    // }
    // public static int print2largest(int arr[], int n) {
    //     // code here
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0; i<n; i++) {
    //         if(arr[i]>max) {
    //             max = arr[i];
    //         }
    //     }
    //     int secMax = Integer.MIN_VALUE;
    //     for(int j=0; j<n; j++) {
    //         if(arr[j]>secMax && arr[j]<max) {
    //             secMax = arr[j];
    //         }
    //     }
    //     return secMax;
    // }
}
