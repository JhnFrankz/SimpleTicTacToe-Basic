import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = Long.parseLong(scanner.nextLine());

        long n = 1;
        long factN = 1;

        while (factN <= m) {
            n++;
            factN *= n;
        }

        System.out.println(n);
    }
}