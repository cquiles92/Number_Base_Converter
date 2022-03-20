import java.util.Locale;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String input = SCANNER.nextLine().toUpperCase(Locale.ROOT);
        int guanineCytosine = 0;
        double percentage;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'C' || input.charAt(i) == 'G') {
                guanineCytosine++;
            }
        }
        System.out.println((double) guanineCytosine * 100 / input.length());
    }
}