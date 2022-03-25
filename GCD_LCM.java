package com.company;

import java.util.Scanner;

public class GCD_LCM {
    static int gcd(int a,int b)
    {
      if(a==0)
      {
          return b;
      }
      return gcd(b%a,a);
    }
    static int lcm(int a,int b)
    {
        return a*b/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1,n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("GCD of these two numbers is : " + gcd(n1,n2));
        System.out.println("LCM of these two numbers is : " + lcm(n1,n2));
    }
}
