package com.company;
import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The Factors Are ");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
