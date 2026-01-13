import java.util.*;
import java.io.*;

public class Part1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(sc.hasNext()){
            String line = sc.nextLine();
            ans += (line.length()) / 2;
        }
        System.out.println(ans);

        sc.close();
    }
}