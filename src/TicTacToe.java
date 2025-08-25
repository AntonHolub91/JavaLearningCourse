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
            if (checkWin(field)) {
                System.out.println("Player 1 won!");
                break;
            }
            if (checkDraw(field)) {
                System.out.println("Draw!");
                break;
            }

            player2.makeMove(scanner, field);
            showField();
            if (checkWin(field)) {
                System.out.println("Player 2 won!");
                break;
            }
        }
        System.out.println("The end!");
    }

    public static void showField() {
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
                || (field[0][2].equals(field[1][1]) && field[0][2].equals(field[2][0]) && field[1][1].equals(field[2][0]))) {
            return true;
        }
        return false;
    }

    public static boolean checkDraw(String[][] field) {
        for (String[] array : field) {
            for (String slot : array) {
                if (slot != "0" && slot != "X") {
                    return false;
                }
            }
        }
        return true;
    }
}

class Player {
    static int counter;
    int playerNum;
    String marker;

    public Player(String marker) {
        counter++;
        this.playerNum = counter;
        this.marker = marker;
    }

    public void makeMove(Scanner scanner, String[][] field) {
        int input;
        boolean slotIsVacant = false;
        System.out.print("Player " + playerNum + ", select vacant slot from the game field to occupy: ");
        while (true) {
            input = scanner.nextInt();
            if (input >= 1 && input <= 9) {
                for (int i = 0; i < field.length; i++) {
                    for (int j = 0; j < field[i].length; j++) {
                        if (field[i][j].equals(String.valueOf(input))) {
                            slotIsVacant = true;
                            break;
                        }
                    }
                }
                if (slotIsVacant) {
                    break;
                }
            }
            System.out.print("Wrong slot selected. Choose vacant one from the game field: ");
        }

        String slot = String.valueOf(input);
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(slot)) {
                    field[i][j] = this.marker;
                }
            }
        }
    }
}