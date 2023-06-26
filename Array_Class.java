import java.util.Arrays;
public class Array_Class {
    public static void main(String args[]) {
        int list[] = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(java.util.Arrays.binarySearch(list,11)); //Binary Search

        char ch[] = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(java.util.Arrays.binarySearch(ch, 'a'));

        int list1[] = {2, 4, 7, 10};
        int list2[] = {2, 4, 7, 10};
        int list3[] = {4, 2, 7, 10};
        System.out.println(java.util.Arrays.equals(list1, list2)); //direct check equal
        System.out.println(java.util.Arrays.equals(list2, list3));

        java.util.Arrays.fill(list1, 5);                    // fill the array
        System.out.println(java.util.Arrays.equals(list1, list2));

        System.out.println(java.util.Arrays.toString(list1));  //convert into string



    }
}
