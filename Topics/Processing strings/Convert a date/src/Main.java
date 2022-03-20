import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] inputDate = SCANNER.nextLine().split("-");
        System.out.printf("%s/%s/%s", inputDate[1], inputDate[2], inputDate[0]);
    }
}