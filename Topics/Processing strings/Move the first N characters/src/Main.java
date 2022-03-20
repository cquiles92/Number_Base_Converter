import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] inputs = SCANNER.nextLine().split(" ");
        int subStringPos = Integer.parseInt(inputs[inputs.length - 1]);
        if (subStringPos > inputs[0].length()) {
            System.out.println(inputs[0]);
        } else {
            System.out.println(inputs[0].substring(subStringPos) + inputs[0].substring(0, subStringPos));
        }
    }
}