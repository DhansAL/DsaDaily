package com.company.backtracking;

public class backtracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}

        };
        back("", board,0,0);
    }

    static void back(String p, boolean[][] maze,int r,int c){
        if(r ==maze.length-1 &&c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false) {
            return;
        }
        //marking the cells which i landed as false
        maze[r][c] = false;
        if (r<maze.length-1){
            back(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length -1){
            back(p+'R',maze,r,c+1);
        }
        if (r>0){
            back(p+'U',maze,r-1,c);
        }
        if(c >0){
            back(p+'L',maze,r,c-1);
        }
        // now restoring the array to default aka backtraking
        maze[r][c] = true;
    }
}
