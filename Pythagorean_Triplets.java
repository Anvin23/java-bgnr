package com.company;
import java.util.Scanner;

public class Pythagorean_Triplets {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner in = new Scanner(System.in);
        int n1,n2,n3;
        n1=in.nextInt();
        n2=in.nextInt();
        n3=in.nextInt();
        if(n1*n1==(n2*n2+n3*n3) || n2*n2==(n1*n1+n3*n3) || n3*n3==(n1*n1+n2*n2))
        {
            System.out.println("This is a pythagorean triplet");
        }
        else
        {
            System.out.println("This is not a pythagorean triplet");
        }
        }
}
