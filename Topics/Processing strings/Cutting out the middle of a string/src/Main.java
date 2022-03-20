import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder(SCANNER.nextLine());
        if (output.length() % 2 == 1) {
            output.deleteCharAt(output.length() / 2);
        } else {
            output.delete(output.length() / 2 - 1, output.length() / 2 + 1);
        }
        System.out.println(output);
    }
}