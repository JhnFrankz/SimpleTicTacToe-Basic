package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String[] symbolsInput = scanner.nextLine().split("");

        System.out.println("---------");
        for (int i = 0; i < symbolsInput.length;) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%s ", symbolsInput[i]);
                i++;
            }
            System.out.println("|");
        }
        System.out.println("---------");

    }
}
