import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String input = SCANNER.nextLine();
        StringBuilder result = new StringBuilder();
        int counter = 1;

        if (input.length() == 1) {
            result.append(input).append(1);
        } else {
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == input.charAt(i - 1)) {
                    counter++;
                } else {
                    result.append(input.charAt(i - 1)).append(counter);
                    counter = 1;
                }
                if (i == input.length() - 1) {
                    result.append(input.charAt(i)).append(counter);
                }
            }
        }
        System.out.println(result);
    }
}