import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;

        do {
            number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                continue;
            }
            count++;
        } while (number != 0);

        System.out.println(count);
    }
}