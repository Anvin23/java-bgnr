package com.company;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = sc.nextLine();
        permutations("",word);
    }
    static void permutations(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            permutations(f+ch+l,up.substring(1));
        }
    }
}
