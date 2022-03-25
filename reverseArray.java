package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
         int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The reversed array is ");
        for(int k=size-1;k>=0;k--)
        {
            System.out.print(arr[k] + " ");
        }
    }
}
