package converter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    static String userSelection = "";

    public static void main(String[] args) {
        while (!userSelection.equals("/exit")) {
            selectTargetBase();
        }
    }

    private static void selectTargetBase() {
        while (true) {
            System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");
            userSelection = SCANNER.nextLine();
            if (userSelection.equals("/exit")) {
                return;
            }
            String[] baseInputs = userSelection.split(" ");
            int sourceBase = Integer.parseInt(baseInputs[0]);
            int targetBase = Integer.parseInt(baseInputs[1]);

            numberConversion(sourceBase, targetBase);

        }
    }

    private static void numberConversion(int sourceBase, int targetBase) {
        String numberToConvert;
        while (true) {
            System.out.println("Enter number in base " + sourceBase + " to convert to base " +
                    targetBase + " (To go back type /back)");

            numberToConvert = SCANNER.nextLine();

            if (numberToConvert.equals("/back")) {
                return;
            }
            numberToConvert = numberToConvert.toUpperCase();

            if (numberToConvert.contains(".")) {
                int splitPoint = numberToConvert.indexOf('.');
                String decimalHalf = numberToConvert.substring(splitPoint + 1);
                numberToConvert = numberToConvert.substring(0, splitPoint);

                numberToConvert = convertIntoBaseTen(numberToConvert, sourceBase);
                numberToConvert = convertFromBaseTenToSelected(numberToConvert, targetBase);

                decimalHalf = fractionIntoBaseTen(decimalHalf, sourceBase);
                decimalHalf = decimalFractionIntoNewBaseFraction(decimalHalf, targetBase);

                String result = numberToConvert + "." + decimalHalf;
                printConversion(result);
            } else {
                numberToConvert = convertIntoBaseTen(numberToConvert, sourceBase);
                numberToConvert = convertFromBaseTenToSelected(numberToConvert, targetBase);
                printConversion(numberToConvert);
            }
        }
    }

    private static String convertIntoBaseTen(String userNumber, int selectedBase) {
        BigInteger baseToTen = BigInteger.ZERO;
        int basePower = 0;
        int stringPointer = userNumber.length() - 1;

        while (stringPointer > -1) {
            char currentChar = userNumber.charAt(stringPointer--);
            int currentValue = characterToInt(currentChar);
            BigDecimal calculatedValue = BigDecimal.valueOf(currentValue * Math.pow(selectedBase, basePower++));
            baseToTen = baseToTen.add(calculatedValue.toBigInteger());
        }
        return baseToTen.toString();
    }

    private static String convertFromBaseTenToSelected(String originalNumber, int selectedBase) {
        BigDecimal baseTenChanged = new BigDecimal(originalNumber);
        BigDecimal baseSelected = new BigDecimal(selectedBase);
        StringBuilder result = new StringBuilder();
        int remainder;

        do {
            remainder = baseTenChanged.remainder(baseSelected).intValue();
            baseTenChanged = baseTenChanged.divide(baseSelected, 0, RoundingMode.FLOOR);
            result.append(intToChar(remainder));
        } while (baseTenChanged.compareTo(BigDecimal.ZERO) != 0);
        result.reverse();
        return result.toString();
    }

    private static String fractionIntoBaseTen(String value, int originalBase) {
        BigDecimal result = new BigDecimal(BigInteger.ZERO);
        int stringPointer = 0;
        int basePower = -1;

        while (stringPointer < value.length()) {
            char currentChar = value.charAt(stringPointer++);
            int characterValue = characterToInt(currentChar);
            result = result.add(BigDecimal.valueOf(Math.pow(originalBase, basePower--) * characterValue));
        }
        return result.toString();
    }

    private static String decimalFractionIntoNewBaseFraction(String value, int selectedBase) {
        StringBuilder result = new StringBuilder();
        BigDecimal current = new BigDecimal(value);
        int loopCounter = 0;
        while (loopCounter != 5) {
            current = current.multiply(BigDecimal.valueOf(selectedBase));
            int remainder = current.intValue();
            char currentChar = intToChar(remainder);
            result.append(currentChar);
            current = current.subtract(BigDecimal.valueOf(remainder));
            loopCounter++;
        }
        return result.toString();
    }

    private static int characterToInt(char selectedCharacter) {
        int currentValue = selectedCharacter - 48;
        if (Character.isAlphabetic(selectedCharacter)) {
            currentValue -= 7;
        }
        return currentValue;
    }

    private static char intToChar(int currentValue) {
        char intToChar = (char) (currentValue + 48);
        if (currentValue > 9) {
            intToChar = (char) (currentValue + 55);
        }
        return intToChar;
    }

    private static void printConversion(String result) {
        System.out.println("Conversion result: " + result);
    }
}