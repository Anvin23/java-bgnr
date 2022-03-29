package com.company;

import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] arr ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,90)));
    }
    static int[] binarysearch(int[][]matrix,int row,int cStart,int cEnd,int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    // for sorted matrices

    static int[] search(int[][] matrix , int target)
    {
        int rows= matrix.length;
        int cols= matrix[0].length;
        if(rows==1){
            return binarysearch(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        // run till two rows remain
        while(rStart<(rEnd-1)) // while true it has more than two rows
        {
            int mid = rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target)
            {
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]>target)
            {
                rEnd=mid;
            }
            else
            {
                rStart=mid;
            }
        }
        // now we have two rows
        // check if target is in col of 2 rows
        if(matrix[rStart][cMid]==target)
        {
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target)
        {
            return  new int[]{rStart+1,cMid};
        }
        // search in 1st quarter (ist row in left)
        if(matrix[rStart][cMid-1]>=target)
        {
            return binarysearch(matrix,rStart,0,cMid-1,target);
        }
        // search in 2nd quarter (1st row in right)
        if(matrix[rStart][cMid+1]<=target && target<=matrix[rStart][cols-1])
        {
            return binarysearch(matrix,rStart,cMid+1,cols-1,target);
        }
        // search in 3rd quarter (2nd row in left)
        if(matrix[rStart+1][cMid-1]>=target)
        {
            return binarysearch(matrix,rStart+1,0,cMid-1,target);
        }
        // search in 4th quarter (2nd row in right)
        else
        {
            return binarysearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
}
