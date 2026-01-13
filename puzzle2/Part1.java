package puzzle2;

import java.util.*;
// import java.io.*;

public class Part1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0, max = Integer.MIN_VALUE;

        while(sc.hasNext()){
            String line = sc.nextLine();
            
            for(char c : line.toCharArray()){
                ans += c == 'v' ? -1 : 1;
                max = Math.max(ans, max);
            }
        }

        System.out.println(max);

        sc.close();
    }
}