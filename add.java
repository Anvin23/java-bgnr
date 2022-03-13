package com.company;
import java.util.Scanner;


public class add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s=0;
        System.out.println("Enter Numbers");
        System.out.println("Enter 0 for termination");
        int l=in.nextInt();
        while(l!=0)
        {
            s+=l;
            l=in.nextInt();
        }
        System.out.println("The sum is : " + s);
    }
}
