import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] inputs = SCANNER.nextLine().split(" ");
        System.out.println(Arrays.stream(inputs).max(Comparator.comparingInt(String::length)).get());
    }
}