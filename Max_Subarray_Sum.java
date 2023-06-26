public class Max_Subarray_Sum {
    //brute force approach
    public static void maxSubArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                currSum = 0;
                for(int k=i; k<=j; k++) {
                    currSum+= arr[k];
                }
                maxSum = Math.max(maxSum, currSum);          
            }
        }
        System.out.println(maxSum);
    }
    //prefix sum approach
    public static void maxSubPArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];

        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++) {
            int start = i;
            for(int j=i; j<arr.length; j++) {
                int end = j;
                currSum = (start==0)? prefix[end]: prefix[end]-prefix[start-1];
                if(maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String args[]) {
        int arr[] = {1, -2, 6, -1, 3};
        // maxSubArray(arr);
        maxSubPArray(arr);
    }
}
