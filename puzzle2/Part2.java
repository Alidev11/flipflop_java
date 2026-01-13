package puzzle2;

import java.util.*;
// import java.io.*;

public class Part2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0, max = Integer.MIN_VALUE;

        while(sc.hasNext()){
            String line = sc.nextLine();
            int i=0, j=0, ptr=0;
            char[] charArr = line.toCharArray();

            while(j<charArr.length-1){
                ptr++;
                ans += charArr[i] == 'v' ? -ptr : ptr;
                j++;

                if(charArr[i] != charArr[j] && j != charArr.length){
                    max = Math.max(ans, max);
                    ptr = 0;
                    i = j;
                }
            }
        }

        System.out.println(max);

        sc.close();
    }
}