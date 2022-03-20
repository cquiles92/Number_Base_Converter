import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] readInput = SCANNER.nextLine().split(" ");
        List<Integer> inputs = new ArrayList<>();
        for (int i = readInput.length - 1; i > -1; i--) {
            if (i % 2 == 1) {
                inputs.add(Integer.parseInt(readInput[i]));
            }
        }
        inputs.forEach(input -> System.out.print(input + " "));
    }
}