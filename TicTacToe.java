import java.util.Scanner;

public class TicTacToe{
    //Printing elements of board
    public static void displayBoard(char[][] board){
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.print(board[i][2]);
            System.out.println();
            System.out.println("-----");
        }
        for(int j=0; j<2; j++){
            System.out.print(board[2][j]+"|");
        }
        System.out.print(board[2][2]);
        System.out.println();
    }
	
    public static void main(String[] args) {
        //Game Board
        char[][] board = new char[3][3];
        board[0][0] = ' ';
        board[0][1] = ' ';
        board[0][2] = ' ';
        board[1][0] = ' ';
        board[1][1] = ' ';
        board[1][2] = ' ';
        board[2][0] = ' ';
        board[2][1] = ' ';
        board[2][2] = ' ';

        //Game Logic
        for(int i=1; i<6; i++){
            //Taking input from player 1
            Scanner sc = new Scanner(System.in);
            System.out.println("Player 1 chance : Chose row and column");
            int p1row = sc.nextInt();
            int p1column = sc.nextInt();
            board[p1row][p1column]='X';
            displayBoard(board);

            //Wining logic for player 1
            if(board[0][0]!=' ' && board[0][0]==board[0][1] && board[0][1]==board[0][2]) {
                System.out.println("Player 1 won the match");
                break;
            }else if(board[1][0]!=' ' && board[1][0]==board[1][1] && board[1][1]==board[1][2]) {
                System.out.println("Player 1 won the match");
                break;
            }else if(board[2][0]!=' ' && board[2][0]==board[2][1] && board[2][1]==board[2][2]) {
                System.out.println("Player 1 won the match");
                break;
            }else if(board[0][0]!=' ' && board[0][0]==board[1][0] && board[1][0]==board[2][0]) {
                System.out.println("Player 1 won the match");
                break;
            }else if(board[0][1]!=' ' && board[0][1]==board[1][1] && board[1][1]==board[2][1]) {
                System.out.println("Player 1 won the match");
                break;
            }else if(board[0][2]!=' ' && board[0][2]==board[1][2] && board[1][2]==board[2][2]) {
                System.out.println("Player 1 won the match");
                break;
            }else if(board[2][0]!=' ' && board[2][0]==board[1][1] && board[1][1]==board[0][2]) {
                System.out.println("Player 1 won the match");
                break;
            }else if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                System.out.println("Player 1 won the match");
                break;
            }

            if(i==5){
                System.out.println("It is a Tie");
                break;
            }

            //Taking input from player 2
            System.out.println("Player 2 chance : Chose row and column");
            int p2row = sc.nextInt();
            int p2column = sc.nextInt();
            board[p2row][p2column]='O';
            displayBoard(board);

            //Wining logic for player 2
            if(board[0][0]!=' ' && board[0][0]==board[0][1] && board[0][1]==board[0][2]) {
                System.out.println("Player 2 won the match");
                break;
            }else if(board[1][0]!=' ' && board[1][0]==board[1][1] && board[1][1]==board[1][2]) {
                System.out.println("Player 2 won the match");
                break;
            }else if(board[2][0]!=' ' && board[2][0]==board[2][1] && board[2][1]==board[2][2]) {
                System.out.println("Player 2 won the match");
                break;
            }else if(board[0][0]!=' ' && board[0][0]==board[1][0] && board[1][0]==board[2][0]) {
                System.out.println("Player 2 won the match");
                break;
            }else if(board[0][1]!=' ' && board[0][1]==board[1][1] && board[1][1]==board[2][1]) {
                System.out.println("Player 2 won the match");
                break;
            }else if(board[0][2]!=' ' && board[0][2]==board[1][2] && board[1][2]==board[2][2]) {
                System.out.println("Player 2 won the match");
                break;
            }else if(board[2][0]!=' ' && board[2][0]==board[1][1] && board[1][1]==board[0][2]) {
                System.out.println("Player 2 won the match");
                break;
            }else if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                System.out.println("Player 2 won the match");
                break;
            }
        }
    }
}
