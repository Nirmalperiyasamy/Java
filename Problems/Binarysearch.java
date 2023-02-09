package Problems;

import java.util.Arrays;

public class Binarysearch {

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={4,6,677,8,8,9,5,332,9,4,1};
        Arrays.sort(array);
       int result= binarySearch(array,9);
        System.out.println(array[result]+" "+result);
    }
}
