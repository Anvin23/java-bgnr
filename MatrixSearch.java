package com.company;

import java.util.Arrays;

public class MatrixSearch {
    static int[] search(int[][] matrix , int target)
    {
        int r=0;
        int c= matrix.length-1;

        // for 2D array sorted in ascending order both rowwise and columnwise
        while(r< matrix.length & c>=0)
        {
            if(matrix[r][c]==target)
            {
                return new int[]{r,c};
            }
            if(matrix[r][c]<target)
            {
                r++;
            }
            else
            {
                c--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                {8,9,10,12},
                {11,12,15,20},
                {14,23,34,45},
                {18,27,36,50}
        };
        System.out.println(Arrays.toString(search(arr,80)));
    }
}
