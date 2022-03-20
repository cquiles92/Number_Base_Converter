import java.math.BigInteger;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger input = new BigInteger(SCANNER.nextLine());
        BigInteger compare = BigInteger.ONE;
        int result = 1;
        while (input.compareTo(compare) == 1) {
            compare = compare.multiply(new BigInteger(String.valueOf(++result)));
        }
        System.out.println(result);
    }
}