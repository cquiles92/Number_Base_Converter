import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String input = SCANNER.nextLine();
        StringBuilder test = new StringBuilder(input).reverse();

        if (input.compareTo(test.toString()) == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}