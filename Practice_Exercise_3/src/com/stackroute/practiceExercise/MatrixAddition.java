package com.stackroute.practiceExercise;

import java.util.Scanner;

public class MatrixAddition {
    public static String add(int[][] matrix1, int[][] matrix2, int n, int m){
        int[][] sum = new int[n][m];
        String returnSum = "";
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                returnSum = returnSum + sum[i][j] + "\t";
            }
            returnSum = returnSum.trim();
            returnSum = returnSum + "\n";
        }
        return returnSum.trim();
    }
}
