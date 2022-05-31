import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());
        int[][] x = new int[n][m];
        int mayor = Integer.MIN_VALUE;
        int positionX = 0;
        int positionY = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = Integer.parseInt(scanner.next());
                if (x[i][j] > mayor) {
                    mayor = x[i][j];
                    positionX = i;
                    positionY = j;
                }
            }
        }

        System.out.printf("%d %d", positionX, positionY);
    }
}