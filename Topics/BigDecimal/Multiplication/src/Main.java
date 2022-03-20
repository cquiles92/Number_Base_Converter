import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BigDecimal inputOne = new BigDecimal(SCANNER.nextLine());
        BigDecimal inputTwo = new BigDecimal(SCANNER.nextLine());

        System.out.println(inputOne.multiply(inputTwo));
    }
}