package puzzle3;

import java.util.*;

public class Part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 0;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] colors = line.split(",");
            int[] colorsInt = Arrays.stream(colors).mapToInt(Integer::parseInt).toArray();
            int a = colorsInt[0], b = colorsInt[1], c = colorsInt[2];

            if ((a == b && a != c) ||
                    (a == c && a != b) ||
                    (b == c && b != a)) {
                price += 10;
                continue;
            }

            if (b > a && b > c) {
                price += 2;
            } else if (a > b && a > c) {
                price += 5;
            } else {
                price += 4;
            }
        }

        System.out.println(price);
        sc.close();
    }
}