package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[][] board = new String[3][3];
        Start(board);
        ShowBoard(board);
        int count = 0;
        while (!GameDraw(board, count)) {
            MoveP1(board);
            count++;
            if (P1Win(board, LogicGame(board))) {
                break;
            }
            ShowBoard(board);
            MoveP2(board);
            count++;
            if (P2Win(board, LogicGame(board))) {
                break;
            }
            ShowBoard(board);
        }
    }
    

    static void Start(String[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "A";
            }
        }
    }
    static int LogicGame(String[][] board){
        int result;
        if(board[0][0].equals("*") && board[0][1].equals("*") && board[0][2].equals("*"))
            result = 1;
        else if(board[1][0].equals("*") && board[1][1].equals("*") && board[1][2].equals("*"))
            result = 1;
        else if(board[2][0].equals("*") && board[2][1].equals("*") && board[2][2].equals("*"))
            result = 1;
        else if(board[0][0].equals("*") && board[1][0].equals("*") && board[2][0].equals("*"))
            result = 1;
        else if(board[0][1].equals("*") && board[1][1].equals("*") && board[2][1].equals("*"))
            result = 1;
        else if(board[0][2].equals("*") && board[1][2].equals("*") && board[2][2].equals("*"))
            result = 1;
        else if(board[0][0].equals("*") && board[1][1].equals("*") && board[2][2].equals("*"))
            result = 1;
        else if(board[0][2].equals("*") && board[1][1].equals("*") && board[2][0].equals("*"))
            result = 1;
        else if(board[0][0].equals("0") && board[0][1].equals("0") && board[0][2].equals("0"))
            result = 2;
        else if(board[1][0].equals("0") && board[1][1].equals("0") && board[1][2].equals("0"))
            result = 2;
        else if(board[2][0].equals("0") && board[2][1].equals("0") && board[2][2].equals("0"))
            result = 2;
        else if(board[0][0].equals("0") && board[1][0].equals("0") && board[2][0].equals("0"))
            result = 2;
        else if(board[0][1].equals("0") && board[1][1].equals("0") && board[2][1].equals("0"))
            result = 2;
        else if(board[0][2].equals("0") && board[1][2].equals("0") && board[2][2].equals("0"))
            result = 2;
        else if(board[0][0].equals("0") && board[1][1].equals("0") && board[2][2].equals("0"))
            result = 2;
        else if(board[0][2].equals("0") && board[1][1].equals("0") && board[2][0].equals("0"))
            result = 2;
        else
            result = 0;



        return result;


    }
    static void ShowBoard(String[][] board){

        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print("|" + board[i][j] + "|");
            }
            System.out.println();

        }
    }
    static void MoveP1(String[][] board){
        int n,m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("P1 Input cell ");
        n = scanner.nextInt();
        m = scanner.nextInt();
        if(board[n][m].equals("A")) {
            board[n][m] = "*";
        }else{
            System.out.println("Input another cell");
            MoveP1(board);
        }
    }
    static void MoveP2(String[][] board){
        int n,m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("P2 Input cell ");
        n = scanner.nextInt();
        m = scanner.nextInt();
        if(board[n][m].equals("A")) {
            board[n][m] = "0";
        }else{
            System.out.println("Input another cell");
            MoveP2(board);
        }
    }
    static boolean GameDraw(String[][] board, int count ){
        if(count == 9){
            System.out.println("Draw");
            ShowBoard(board);
            return true;
        }else {
            return false;
        }
    }
    static boolean P1Win(String[][] board, int logic){
        if(logic == 1) {
            System.out.println("P1 win");
            ShowBoard(board);
            return true;
        }
        else{
            return false;
        }

    }
    static boolean P2Win(String[][] board, int logic){
        if(logic == 2) {
            System.out.println("P2 win");
            ShowBoard(board);
            return true;
        }else{
            return false;
        }
    }


}
