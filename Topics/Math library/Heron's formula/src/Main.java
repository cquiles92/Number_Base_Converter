import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int a = Integer.parseInt(SCANNER.nextLine());
        int b = Integer.parseInt(SCANNER.nextLine());
        int c = Integer.parseInt(SCANNER.nextLine());

        double p = ((double) a + (double) b + (double) c) / 2;

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(s);
    }
}