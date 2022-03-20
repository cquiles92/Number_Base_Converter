import java.util.Locale;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final String search = "the";
        String input = SCANNER.nextLine().toLowerCase(Locale.ROOT);
        if (input.contains(search)) {
            System.out.println(input.indexOf(search));
        } else {
            System.out.println(-1);
        }
    }
}