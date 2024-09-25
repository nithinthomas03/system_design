package com.systemdesign.codingchallenge;
public class BinarySearch {
    public static void  main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 40;
        int index = binarySearch(arr, x);
        System.out.println("The element is at position: "+index);
    }

    static int binarySearch(int[] arr, int x) {
        int n = arr.length;
        int l=0;
        int r=n-1;
        int mid=-1;

        while(l<=r) {
            mid = l + (r-l)/2;
            if (arr[mid] == x) {
                return mid;
            } else if (x > mid ) {
                l = mid+1;
            } else if (x < mid) {
                r = mid -1;
            }
        }
        return mid;
    }
}
