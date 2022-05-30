import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int classNumbers = 3;
        int[] students = new int[classNumbers];
        int total = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = Integer.parseInt(scanner.nextLine());
            total += students[i] / 2 + students[i] % 2;
        }

        System.out.println(total);
    }
}