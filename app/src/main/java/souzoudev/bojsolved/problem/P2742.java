package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.Collections;
import java.util.stream.*;

public class P2742 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int a = Integer.parseInt(br.readLine());

            IntStream.rangeClosed(1, a).boxed().sorted(Collections.reverseOrder()).forEach(i -> {
                try {
                    bw.write(Integer.toString(i)); bw.newLine();
                } catch (Exception ignored) {}
            });
        } catch (IOException e) {}
    }
}
