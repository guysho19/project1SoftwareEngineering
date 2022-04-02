import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;  // Note: Do not change this line.

    public static void theStudentsGame() {

        System.out.println("Dear president, please enter the board’s size.");
        Scanner scanner= new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();
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
