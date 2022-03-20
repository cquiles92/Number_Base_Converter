import java.util.*;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        String[] input = SCANNER.nextLine().split(" ");
        int target = Integer.parseInt(SCANNER.nextLine());
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        for (String str : input) {
            results.add(Integer.parseInt(str));
            if (Integer.parseInt(str) == target) {
                output.add(target);
            }
        }
        if (!output.isEmpty()) {
            for (Integer number : output) {
                System.out.print(number + " ");
            }
        } else {
            int low = target - 1;
            int high = target + 1;

            while (output.isEmpty()) {
                if (results.contains(low)) {
                    for (Integer num : results) {
                        if (num == low) {
                            output.add(low);
                        }
                    }
                }
                if (results.contains(high)) {
                    for (Integer num : results) {
                        if (num == high) {
                            output.add(high);
                        }
                    }
                }
                low--;
                high++;
            }
            for (Integer number : output) {
                System.out.print(number + " ");
            }
        }

    }
}