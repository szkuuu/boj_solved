package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.stream.*;

public class P10809 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String target = br.readLine();
            var sb = new StringBuilder();

            IntStream.rangeClosed((int) 'a', (int) 'z')
                .boxed()
                .map(i -> target.indexOf(i))
                .forEach(i -> {
                    sb.append(i).append(' ');
                });

            bw.write(sb.toString().trim()); bw.newLine();
        } catch (IOException e) {}
    }
}
