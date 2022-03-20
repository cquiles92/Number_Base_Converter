import java.util.Locale;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        char[] input = SCANNER.nextLine().toLowerCase(Locale.ROOT).toCharArray();
        boolean result = true;
        for (int i = 1; i < input.length; i++) {
            if (Character.valueOf(input[i]) != Character.valueOf(input[i - 1]) + 1) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}