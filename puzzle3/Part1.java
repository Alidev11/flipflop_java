package puzzle3;

import java.util.*;

public class Part1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String res="";
        Map<String, Integer> counter = new HashMap<>();

        while(sc.hasNext()){
            String line = sc.nextLine();

            counter.put(line, counter.getOrDefault(line,0) + 1 );
            int nb = counter.get(line);
            if(nb > max){
                max = nb;
                res = line;
            }
        }

        System.out.println(res);

        sc.close();
    }
}