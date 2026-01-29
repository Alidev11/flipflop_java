package puzzle3;

import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isGreen = false;
        int counter = 0;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] colors = line.split(",");
            int[] colorsInt = Arrays.stream(colors).mapToInt(Integer::parseInt).toArray();
            int a = colorsInt[0], b = colorsInt[1], c = colorsInt[2];

            if (b > a && b > c) {
                isGreen = true;
                counter++;
            } else {
                isGreen = false;
            }

            if (isGreen && ((a == b && a != c) ||
                            (a == c && a != b) ||
                            (b == c && b != a))) {
                counter--;
            }
        }

        System.out.println(counter);
        sc.close();
    }
}