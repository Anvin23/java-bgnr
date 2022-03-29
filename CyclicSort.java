package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
      int[] arr = {6,7,1,10,3,5,8,4,2,9};
      // numbers should be in range 1 to N numbers should be continous
        cycsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycsort(int [] arr)
            // for arrays which have elements in range of 1 to N
    {
        int i=0;
        while(i<arr.length)
        {
            int reqindex=arr[i]-1;
            if(arr[i] != arr[reqindex])
            {
                swap(arr,i,reqindex);
            }
            else
            {
                i++;
            }
        }
    }
    static void swap(int[]arr,int f,int s)
    {
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
