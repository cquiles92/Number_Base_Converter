import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int power = Integer.parseInt(SCANNER.nextLine());
        int scale = Integer.parseInt(SCANNER.nextLine());
        BigDecimal number = new BigDecimal(SCANNER.nextLine());

        number = number.setScale(scale, RoundingMode.FLOOR).pow(power);
        System.out.println(number);
    }
}