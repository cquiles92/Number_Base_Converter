import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        double a = Double.parseDouble(SCANNER.nextLine());
        double b = Double.parseDouble(SCANNER.nextLine());
        double c = Double.parseDouble(SCANNER.nextLine());

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        double rootOne = (-b + Math.sqrt(discriminant)) / (2 * a);
        double rootTwo = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println(Math.min(rootOne, rootTwo) + " " + Math.max(rootOne, rootTwo));
    }
}