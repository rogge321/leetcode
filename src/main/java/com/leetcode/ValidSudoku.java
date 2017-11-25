package com.leetcode;

import java.util.HashMap;

/**
 * Created by rogge on 2017/4/3.
 */
public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {

        if(board == null || board.length < 3 || board.length % 3 != 0)
            return false;

        int length = board.length;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++){
                if(board[i] != null && board[i].length == length && board[i].length%3 == 0)
                    continue;
                else
                    return false;
            }
        }

        HashMap<Integer, Integer>[] xMap = new HashMap[length];
        HashMap<Integer, Integer>[] yMap = new HashMap[length];
        HashMap<Integer, Integer>[] zMap = new HashMap[length];

        for(int i = 0; i < length; i++) {
            xMap[i] = new HashMap<Integer, Integer>();
            yMap[i] = new HashMap<Integer, Integer>();
            zMap[i] = new HashMap<Integer, Integer>();
        }

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(board[i][j] != '.'){
                    char c = board[i][j];
                    Integer num = c - '0';
                    if(xMap[i].containsKey(num))
                        return false;
                    else
                        xMap[i].put(num,0);

                    if(yMap[j].containsKey(num))
                        return false;
                    else
                        yMap[j].put(num,0);

                    int zPos = (i / 3)*3  + j / 3;
                    System.out.println(i + " " +zPos);
                    if(zMap[zPos].containsKey(num))
                        return false;
                    else
                        zMap[zPos].put(num,0);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] boards = {{'.','8','7','6','5','4','3','2','1'},
                {'2','.','.','.','.','.','.','.','.'},
                {'3','.','.','.','.','.','.','.','.'},
                {'4','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','.','.'},
                {'6','.','.','.','.','.','.','.','.'},
                {'7','.','.','.','.','.','.','.','.'},
                {'8','.','.','.','.','.','.','.','.'},
                {'9','.','.','.','.','.','.','.','.'}};


        ValidSudoku.isValidSudoku(boards);
    }
}
