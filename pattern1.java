package com.company;

public class pattern1 {
    public static void patt(int n) {
        if (n == 1) {
            System.out.println("1");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        patt(n - 1);
        for (int j = 1; j <= n; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        patt(6);
    }
}


