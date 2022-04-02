import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;  // Note: Do not change this line.
    public static final int VALID = 1;
    public static final int NOT_VALID = 0;

    public static void theStudentsGame() {
        System.out.println("Dear president, please enter the board’s size.");
        scanner= new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();
        int[][] students_board=new int[rows][columns];
        System.out.println("Dear president, please enter the cell's indexes.");
    }
    public static void initializeBoard(int[][] students_board) {
        for (int i = 0; i <students_board.length ; i++) {
            for (int j = 0; j <students_board[0].length ; j++) {
                students_board[i][j]=NOT_VALID;
            }
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
