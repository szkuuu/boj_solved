package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.stream.*;

public class P2439 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int a = Integer.parseInt(br.readLine());
            var sb = new StringBuilder();

            IntStream.rangeClosed(1, a).boxed().forEach(i -> {
                sb.setLength(0);

                try {
                    bw.write(
                        sb
                            .append(new String(new char[a - i]).replace('\0', ' '))
                            .append(new String(new char[i]).replace('\0', '*'))
                            .toString()
                    );
                    bw.newLine();
                } catch (Exception ignored) {}
            });
        } catch (IOException e) {}
    }
}
