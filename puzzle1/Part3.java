import java.util.*;
// import java.io.*;

public class Part3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while(sc.hasNext()){
            String line = sc.nextLine();
            int length = line.length() / 2;
            
            ans += line.contains("e") ? 0 : length;
        }

        System.out.println(ans);

        sc.close();
    }
}