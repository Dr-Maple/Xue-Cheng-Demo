package com.maple.suanfa;

import java.util.*;


public class Solution {    /**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *
 * 判断岛屿数量
 * @param grid char字符型二维数组
 * @return int整型
 */
    //@TODO ?
    int soult = 0;
    public int solve (char[][] grid) {
        chazhao(grid);
        return soult;
    }
    public void chazhao(char[][] grid){

        int row = 0;
        int col = 0;
        // write code here
        for(char[] i:grid){

            for(char index:i){


                if(index==1)//index -> dao
                {
                    panduan(row,col,++soult,grid);
                    System.out.println(soult);
                }// seek daos
                col++;
            }
            row++;
        }

    }
    public void panduan(int row,int col,int num,char[][] grid){
        if(row==0&&col==0)
            return;
        if(row == 0&&grid[row][col-1]==1) {
            soult--;
            return;
        }
        if(col == 0&&grid[row-1][col]==1) {
            soult--;
            return;
        }
        if(grid[row][col-1]==1||grid[row-1][col]==1)
            soult--;
    }

}