package puzzle4;

import java.util.*;
// import java.io.*;

public class Part1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int[] cache = new int[]{0,0};

        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] coordinates = line.split(",");
            int[] coordinatesInt = Arrays.stream(coordinates).mapToInt(Integer::parseInt).toArray();
            
            ans += Math.abs(coordinatesInt[0] - cache[0]) + Math.abs(coordinatesInt[1] - cache[1]);
            cache[0] = coordinatesInt[0];
            cache[1] = coordinatesInt[1];
        }

        System.out.println(ans);
        sc.close();
    }
}