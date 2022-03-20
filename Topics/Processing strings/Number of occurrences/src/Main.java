import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String input = SCANNER.nextLine();
        Pattern substring = Pattern.compile(SCANNER.nextLine());
        Matcher search = substring.matcher(input);
        int counter = 0;

        while (search.find()) {
            counter++;
        }
        System.out.println(counter);
    }
}