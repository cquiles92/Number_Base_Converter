import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String url = SCANNER.nextLine();
        final String matchPattern = "index.html?";
        String parseSection = url.substring(url.lastIndexOf(matchPattern) + matchPattern.length());
        String[] sections = parseSection.split("&");
        String password = null;
        final String passwordKeyWord = "pass";

        for (String part : sections) {
            String[] subArr = part.split("=");
            if (subArr[0].equals(passwordKeyWord)) {
                password = subArr[1];
            }
            if (subArr.length > 1) {
                System.out.println(subArr[0] + " : " + subArr[1]);
            } else {
                System.out.println(subArr[0] + " : not found");
            }
        }
        if (password != null) {
            System.out.println("password : " + password);
        }
    }
}