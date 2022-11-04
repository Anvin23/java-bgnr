package com.company;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of names : ");
        n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter the names");
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            names[i] = sc.nextLine();
        }

        QuickSort ob = new QuickSort();
        ob.sort(names,0,n-1);

        System.out.println(Arrays.toString(names));

    }

    void sort(String[] arr, int low, int high) {
        if(low<high)
        {
            int pi = part(arr,low,high);
            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
    }

    int part(String[] arr, int low, int high) {
        int mid = (low+high)/2 , s = low , e = high;
        int pi = mid;
        String pivot = arr[mid];
        while(s<e)
        {
            while(arr[s].compareTo(pivot)<0)
            {
                s++;
            }
            while(arr[e].compareTo(pivot)>0)
            {
                e--;
            }

            if(s<e)
            {
                if(pi==s)
                {
                    pi = e;
                }
                else if(pi==e)
                {
                    pi = s;
                }
                String temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                if(pi==s)
                {
                    e--;
                }
                else if(pi==e)
                {
                    s++;
                }
                else
                {
                   s++;
                   e--;
                }
            }
        }
        return pi;
    }
}
