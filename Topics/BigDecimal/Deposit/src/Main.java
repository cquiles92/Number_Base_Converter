import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BigDecimal startingAmount = new BigDecimal(SCANNER.nextLine());
        BigDecimal interestRate = new BigDecimal(SCANNER.nextLine());
        final BigDecimal divideBy100 = BigDecimal.valueOf(100);
        interestRate = interestRate.divide(divideBy100).add(BigDecimal.ONE);
        int years = Integer.parseInt(SCANNER.nextLine());

        interestRate = interestRate.pow(years);
        BigDecimal result = startingAmount.multiply(interestRate);

        System.out.println("Amount of money in the account: " + result.setScale(2, RoundingMode.CEILING));
    }
}