import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> companies = Arrays.asList(SCANNER.nextLine().split(" "));
        System.out.println(companies.toString());
    }
}