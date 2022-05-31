package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int size = 3;

        System.out.print("Enter cells: ");
        String line = scanner.nextLine();
        char[][] x = new char[size][size];
        int aux = 0;    //para llenar el array
        int conX = 0;
        int conO = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                x[i][j] = line.charAt(aux);
                aux++;
            }
        }

        System.out.println("---------");
        for (int i = 0; i < x.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < x[i].length; j++) {
                System.out.printf("%s ", x[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("---------");

        boolean existLineO = false;
        boolean existLineX = false;
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;

        for (int i = 0; i < size; i++) {
            int sumRow = 0;
            int sumColumn = 0;
            for (int j = 0; j < size; j++) {
                if (x[i][j] == 'O') {
                    conO++;
                }
                if (x[i][j] == 'X') {
                    conX++;
                }

                sumRow += x[i][j];
                sumColumn += x[j][i];

                if (i == j) {
                    sumDiagonal1 += x[i][j];
                }

                if (i + j == 2) {
                    sumDiagonal2 += x[i][j];
                }
            }

            if (sumRow == 237 || sumColumn == 237 ||
                sumDiagonal1 == 237 || sumDiagonal2 == 237) {
                existLineO = true;
            }
            if (sumRow == 264 || sumColumn == 264 ||
                    sumDiagonal1 == 264 || sumDiagonal2 == 264) {
                existLineX = true;
            }

            if (existLineX && existLineO) {
                break;
            }
        }

        //Verify if exist more X than O or
        // if exist one row of X and O
        if ((conO - conX >= 2 || conX - conO >= 2) ||
            existLineX && existLineO) {
            System.out.println("Impossible");
        } else if (!existLineO && !existLineX && conX + conO == 9) {
            System.out.println("Draw");
        } else if (existLineX){
            System.out.println("X wins");
        } else if (existLineO){
            System.out.println("O wins");
        } else {
            System.out.println("Game not finished");
        }

    }
}
