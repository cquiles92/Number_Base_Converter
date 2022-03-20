import java.util.*;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    static final int REPEAT_RESTRICTION = 2;
    static final String CAPITAL_PAIR = "AB";
    static final String LOWER_CASE_PAIR = "ab";
    static final String DIGIT_PAIR = "12";

    public static void main(String[] args) {
        int[] values = Arrays.stream(SCANNER.nextLine()
                        .trim()
                        .split(" "))
                .filter(x -> !x.equals(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder password = new StringBuilder();

        //Append capital letters
        buildString(password, values[0], CAPITAL_PAIR);

        //Append lowercase letters
        buildString(password, values[1], LOWER_CASE_PAIR);

        //Append digits
        buildString(password, values[2], DIGIT_PAIR);

        //add remaining characters
        buildTail(password, values[3]);

        System.out.println(password);
    }

    public static void buildString(StringBuilder password, int value, String repeat) {
        for (int i = 0; i < value / REPEAT_RESTRICTION; i++) {
            password.append(repeat);
        }
        if (value % REPEAT_RESTRICTION == 1) {
            password.append(repeat.substring(0, 1));
        }
    }

    public static void buildTail(StringBuilder password, int targetLength) {
        int remainingLength = targetLength - password.length();
        String selectedRepeat;
        if (!password.toString().endsWith(CAPITAL_PAIR) &&
                !password.toString().endsWith(CAPITAL_PAIR.substring(0, 1))) {
            selectedRepeat = CAPITAL_PAIR;
        } else if (!password.toString().endsWith(LOWER_CASE_PAIR) &&
                !password.toString().endsWith(LOWER_CASE_PAIR.substring(0, 1))) {
            selectedRepeat = LOWER_CASE_PAIR;
        } else {
            selectedRepeat = DIGIT_PAIR;
        }
        buildString(password, remainingLength, selectedRepeat);
    }
}