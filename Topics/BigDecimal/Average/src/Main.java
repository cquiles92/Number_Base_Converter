import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BigDecimal numberOne = SCANNER.nextBigDecimal();
        BigDecimal numberTwo = SCANNER.nextBigDecimal();
        BigDecimal numberThree = SCANNER.nextBigDecimal();
        final BigDecimal divisor = BigDecimal.valueOf(3);

        BigDecimal result = numberOne.add(numberTwo).add(numberThree).divide(divisor, 0, RoundingMode.DOWN);
        System.out.println(result);
    }
}