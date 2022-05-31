import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int[][] x = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = Integer.parseInt(scanner.next());
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(x[j][i] + " ");
            }
            System.out.println();
        }
    }
}