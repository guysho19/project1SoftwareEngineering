import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;  // Note: Do not change this line.
    public static final int VALID = 1;
    public static final int INVALID = 0;
    public static final char ACADEMICALLY_VALID_SIGN ='▮';
    public static final char ACADEMICALLY_INVALID_SIGN ='▯';
    public static final String YOKRA = "Yokra";
    public static final int SUB_INPUT_LENGTH = 2;



    public static void theStudentsGame() {
        System.out.println("Dear president, please enter the board’s size.");
        scanner= new Scanner(System.in);
        int rows=scanner.nextInt();
        scanner.next();
        int columns=scanner.nextInt();
        scanner.nextLine();
        int[][] students_board=new int[rows][columns];
        initializeBoard(students_board);
        //printBoard(students_board);
        getIndexes(students_board);
    }
    

    
    public static void initializeBoard(int[][] students_board) {
        for (int i = 0; i <students_board.length ; i++) {
            for (int j = 0; j <students_board[0].length ; j++) {
                students_board[i][j]=INVALID;
            }
        }
    }
    public static void getIndexes(int[][] students_board) {
        String input = "";
        int row=0,column=0;
        while(!input.equals(YOKRA)){
            System.out.println("Dear president, please enter the cell's indexes.");
            input=scanner.nextLine();
             String[] subInput=input.split(", ",SUB_INPUT_LENGTH);
             if (subInput.length==SUB_INPUT_LENGTH){
                 row =Integer.parseInt(subInput[0]);
                 column =Integer.parseInt(subInput[1]);
                if (isInBoard(students_board,row,column)){
                    if (students_board[row][column]==INVALID){
                        students_board[row][column]=VALID;
                    }else{
                        students_board[row][column]=INVALID;
                    }
                }else{
                    System.out.println("The cell is not within the board’s boundaries, enter a new cell.");
                }
             }
            //printBoard(students_board);
        }
       // printBoard(students_board);

    }
    public static boolean isInBoard(int[][] students_board,int row, int column) {
        if (row < 0 || row >= students_board.length || column < 0 || column >= students_board[0].length)
             return false;
        return true;
    }


        public static void printBoard (int[][] board){
        for (int i=0;i< board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if (board[i][j]==1)
                    System.out.print(ACADEMICALLY_VALID_SIGN);
                else System.out.print(ACADEMICALLY_INVALID_SIGN);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws IOException {
        //String path = args[0];
       // System.out.println("hey kfir just checking of something has changed");
        //scanner = new Scanner(new File(path));
        Scanner scanner= new Scanner(System.in);
        int numberOfGames = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfGames; i++) {
            System.out.println("Game number " + i + " starts.");
            theStudentsGame();
            System.out.println("Game number " + i + " ended.");
            System.out.println("-----------------------------------------------");
        }
        System.out.println("All games are ended.");
    }
}
