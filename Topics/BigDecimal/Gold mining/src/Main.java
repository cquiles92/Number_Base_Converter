import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BigDecimal dwarfDwalin = new BigDecimal(SCANNER.nextLine());
        BigDecimal dwarfBalin = new BigDecimal(SCANNER.nextLine());
        BigDecimal dwarfThorin = new BigDecimal(SCANNER.nextLine());

        System.out.println(dwarfDwalin.add(dwarfBalin).add(dwarfThorin));
    }
}