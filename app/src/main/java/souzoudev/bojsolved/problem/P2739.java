package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.stream.*;;

public class P2739 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            int a = Integer.parseInt(br.readLine());
            
            IntStream.rangeClosed(1, 9)
                .boxed()
                .map(i -> String.format("%d * %d = %d", a, i, a * i))
                .forEach(s -> {
                    try {
                        bw.write(s);
                        bw.newLine();
                    } catch (IOException e) { e.printStackTrace(); }
                });
        } catch (IOException e) {}
    }
}
