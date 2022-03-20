import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] lineOne = SCANNER.nextLine().split(" ");
        String[] lineTwo = SCANNER.nextLine().split(" ");

        int dotProduct = Integer.parseInt(lineOne[0]) * Integer.parseInt(lineTwo[0])
                + Integer.parseInt(lineOne[1]) * Integer.parseInt(lineTwo[1]);

        double lengthLineOne = Math.sqrt(Math.pow(Integer.parseInt(lineOne[0]), 2)
                + Math.pow(Integer.parseInt(lineOne[1]), 2));

        double lengthLineTwo = Math.sqrt(Math.pow(Integer.parseInt(lineTwo[0]), 2)
                + Math.pow(Integer.parseInt(lineTwo[1]), 2));

        double cosineResult = dotProduct / (lengthLineOne * lengthLineTwo);

        System.out.println(Math.toDegrees(Math.acos(cosineResult)));
    }
}