import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        char[] numbers = SCANNER.nextLine().toCharArray();

        int front = 0;
        int back = 0;

        for (int i = 0; i < numbers.length / 2; i++) {
            front += Character.valueOf(numbers[i]);
        }
        for (int i = numbers.length / 2; i < numbers.length; i++) {
            back += Character.valueOf(numbers[i]);
        }

        if (front == back) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}