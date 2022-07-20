package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.stream.*;

public class P2438 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; ++i) {
                bw.write(IntStream.rangeClosed(1, i + 1).boxed().map(a -> "*").collect(Collectors.joining()));
                bw.newLine();
            }
        } catch (IOException e) {}
    }
}
