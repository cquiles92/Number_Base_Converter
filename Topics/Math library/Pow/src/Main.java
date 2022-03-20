import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double base = SCANNER.nextDouble();
        double power = SCANNER.nextDouble();

        System.out.println(Math.pow(base, power));
    }
}