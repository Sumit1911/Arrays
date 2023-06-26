public class BinarySearch {
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
        int arr[] = {2, 4, 5, 6, 8, 11};
        int key = 11;
        System.out.println(binary_Search(arr, key));
    }
}
