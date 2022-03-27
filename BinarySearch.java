package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int search(int[] arr , int target , int s , int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m =s+(e-s)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(target<arr[m])
        {
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in ascending  order");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int t=sc.nextInt();
        System.out.println(search(arr,t,0,n-1));

    }
}
