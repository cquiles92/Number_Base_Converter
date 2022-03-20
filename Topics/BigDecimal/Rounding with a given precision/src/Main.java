import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BigDecimal input = new BigDecimal(SCANNER.nextLine());
        int scale = Integer.parseInt(SCANNER.nextLine());

        System.out.println(input.setScale(scale, RoundingMode.HALF_DOWN));
    }
}