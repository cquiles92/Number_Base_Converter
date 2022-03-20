import java.math.BigInteger;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] input = SCANNER.nextLine().split(" ");
        BigInteger a = new BigInteger(input[0]).negate();
        BigInteger b = new BigInteger(input[1]);
        BigInteger c = new BigInteger(input[2]);
        BigInteger d = new BigInteger(input[3]);

        BigInteger result = a.multiply(b).add(c).subtract(d);
        System.out.println(result);
    }
}