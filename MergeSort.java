package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,12,10};
        mergesortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesortInPlace(int[] arr,int s,int e)
    {
        if(e-s==1)
        {
            return ;
        }
        int mid = (s+e)/2;

        mergesortInPlace(arr,s,mid);
        mergesortInPlace(arr,mid,e);

        merge(arr,s,mid,e);
    }

    static void merge(int[] arr,int s,int mid,int e)
    {
        int[] joined = new int[e-s];

        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e)
        {
            if(arr[i]<arr[j])
            {
                joined[k]=arr[i];
                i++;
            }
            else
            {
                joined[k]=arr[j];
                j++;
            }
            k++;
        }

        // if one array is lesser than another
        //  eg: [1,3] and [2,4,5]

        // copy remaining elements
        while(i<mid)
        {
            joined[k]=arr[i];
            i++;
            k++;
        }
        while(j<e)
        {
            joined[k]=arr[j];
            j++;
            k++;
        }
        for (int l=0;l< joined.length;l++)
        {
            arr[s+l]=joined[l];
        }
    }
}
