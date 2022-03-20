import java.util.*;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        char[] letters = SCANNER.nextLine().toLowerCase().toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' ||
                    letters[i] == 'o' || letters[i] == 'u' || letters[i] == 'y') {
                letters[i] = 'V';
            } else {
                letters[i] = 'C';
            }
        }
        String word = new String(letters);
        int count = 0;
        int subStringLength = 3;
        for (int i = 0; i <= word.length() - subStringLength; i++) {
            if (word.substring(i, i + subStringLength).equals("CCC") ||
                    word.substring(i, i + subStringLength).equals("VVV")) {
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}