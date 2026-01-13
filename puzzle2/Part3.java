package puzzle2;

import java.util.*;
import java.io.*;

public class Part3{
    public static int fib(int nb){
        int[] fibArr = new int[nb+1];
        fibArr[0] = 0;
        fibArr[1] = 1;

        for(int i=2; i<fibArr.length; i++){
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
        }

        return fibArr[nb];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0, max = Integer.MIN_VALUE;

        while(sc.hasNext()){
            String line = sc.nextLine();
            int i=0, j=0, ptr=0;
            char[] charArr = line.toCharArray();

            while(j<charArr.length-1){
                ptr++;
                
                j++;

                if(charArr[i] != charArr[j]){
                    ans += charArr[i] == 'v' ? -fib(ptr) : fib(ptr);
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