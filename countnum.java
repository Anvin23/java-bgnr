package com.company;

import java.util.Scanner;

public class countnum {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long num = sc.nextLong();
        System.out.println("Enter digit to be checked");
        int dig = sc.nextInt();
        while(num/10!=0)
        {
            long rem = num%10;
            if(rem==dig)
            {
                count++;
            }
            num/=10;
        }
        if(num==dig)
        {
            count++;
        }
        System.out.println(count);

    }
}
