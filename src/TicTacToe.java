import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static String[][] field = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("X");
        Player player2 = new Player("0");

        showField();

        while (true) {
            player1.makeMove(scanner, field);
            showField();
            if (checkWin(field)){
                System.out.println("Player 1 won!");
                break;
            };

            player2.makeMove(scanner, field);
            showField();
            if (checkWin(field)){
                System.out.println("Player 2 won!");
                break;
            };
        }
        System.out.println("The end!");
    }

    public static void showField(){
        for (String[] row : field) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static boolean checkWin(String[][] field) {
        if ((field[0][0].equals(field[0][1]) && field[0][0].equals(field[0][2]) && field[0][1].equals(field[0][2]))
                || (field[1][0].equals(field[1][1]) && field[1][0].equals(field[1][2]) && field[1][1].equals(field[1][2]))
                || (field[2][0].equals(field[2][1]) && field[2][0].equals(field[2][2]) && field[2][1].equals(field[2][2]))
                || (field[0][0].equals(field[1][0]) && field[0][0].equals(field[2][0]) && field[1][0].equals(field[2][0]))
                || (field[0][1].equals(field[1][1]) && field[0][1].equals(field[2][1]) && field[1][1].equals(field[2][1]))
                || (field[0][2].equals(field[1][2]) && field[0][2].equals(field[2][2]) && field[1][2].equals(field[2][2]))
                || (field[0][0].equals(field[1][1]) && field[0][0].equals(field[2][2]) && field[1][1].equals(field[2][2]))
                || (field[0][2].equals(field[1][1]) && field[0][2].equals(field[2][0]) && field[1][1].equals(field[2][0]))
        ) {
            return true;
        }
        return false;
    }
}

class Player {
    static int counter;
    int playerNum;
    String value;

    public Player(String value) {
        counter++;
        this.playerNum = counter;
        this.value = value;
    }

    public void makeMove(Scanner scanner, String[][] field) {
        int input;
        while(true) {
            System.out.print("Player " + playerNum + ", select slot to occupy: ");
            input = scanner.nextInt();
            if (input >= 1 && input <= 9) {
                break;
            }
            System.out.println("Slot doesn't exist.");
        }

        String slot = String.valueOf(input);
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(slot)) {
                    field[i][j] = this.value;
                }
            }
        }
    }
}