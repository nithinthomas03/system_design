package com.systemdesign.codingchallenge;

public class SearchRotatedSortedArray {
    public static void  main(String[] args) {
        int[] arr = { 7,6,1, 2, 3, 4, 5}; // {3,4,5,6,7,1,2}   {1,2,3,*4*,5,6,7}
        int x = 1;
        int index = binarySearchRotatedArray(arr, x);
        System.out.println("The element is at position: "+index);
    }

    static int binarySearchRotatedArray(int[] arr, int x) {
        int n = arr.length;
        int l=0;
        int r=n-1;
        int mid=-1;

        while(l<=r) {
            mid = l +(r-l)/2;

            if (x == arr[mid]) {
                return mid;
            }

            if(arr[l] < arr[mid]) {
                if(x <= arr[l] && x <= arr[mid]) {
                    r = mid -1;
                } else {
                    l = mid +1;
                }
            }

            if(arr[mid] < arr[r]) {
                if(x >= arr[mid] && x <= arr[r]){
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            }
        }
        return -1;
    }
}
