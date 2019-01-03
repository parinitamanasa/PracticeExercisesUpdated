package com.stackroute.practiceExercise;

public class ChessBoard {
    public String chessBoard(){
        String[][] chessBoard = new String[8][8];
        String chessBoard1 = "";
        int i, j;
        for(i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                if(i%2 == j%2){
                    chessBoard[i][j] = "WW";
                }
                else{
                    chessBoard[i][j]="BB";
                }
            }
        }
        for(i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                chessBoard1 = chessBoard1+chessBoard[i][j]+"|";
            }
            chessBoard1 = chessBoard1 + "\n";
        }
    return chessBoard1.trim();
    }
}
