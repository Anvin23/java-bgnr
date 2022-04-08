package com.company;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {0,1,0,7,2,6,4,0,0},
                {0,2,4,0,0,1,0,7,6},
                {0,6,0,3,4,0,2,5,1},
                {0,4,0,0,7,0,0,9,5},
                {8,5,0,0,0,0,0,0,0},
                {0,0,7,0,0,0,0,3,0},
                {0,0,0,0,0,5,0,0,9},
                {4,3,5,9,6,0,7,1,0},
                {9,0,6,0,0,0,0,0,2}
        };
        if(solve(board))
        {
            display(board);
        }
        else {
            System.out.println("Couldn't solve");
        }
    }
    static boolean solve(int[][] board)
    {
        int row=-1;
        int col=-1;
        boolean filled=true;
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j<9; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    filled = false;
                    break;
                }
            }
            if (!filled) {
                break;
            }
        }
            if(filled)
            {
                return true;
                // sudoku solved
            }
            for(int number=1;number<=9;number++)
            {
                if(isSafe(board,row,col,number))
                {
                    board[row][col]=number;
                    if(solve(board))
                    {
                        return  true;
                    }
                    else
                    {
                        // backtrack
                        board[row][col]=0;
                    }
                }
            }
        return false;
    }
    static void display(int[][] board)
    {
        for(int p=0;p<9;p++)
        {
            for(int q=0;q<9;q++)
            {
                System.out.print(board[p][q] + " ");
                if(q==2 || q==5)
                {
                    System.out.print("  ");
                }
                if((p==2 || p==5) && q==8)
                {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board,int row,int col,int num)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==num)
            {
                return false;
            }
            if(board[i][col]==num)
            {
                return false;
            }
        }
        int Rstart=row-(row%3);
        int Cstart=col-(col%3);

        for(int r=Rstart;r<Rstart+3;r++)
        {
            for(int c=Cstart;c<Cstart+3;c++)
            {
                if(board[r][c]==num)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
