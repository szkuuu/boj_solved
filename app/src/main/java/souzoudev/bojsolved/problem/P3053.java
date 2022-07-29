package souzoudev.bojsolved.problem;

import java.io.*;

public class P3053 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int r = Integer.parseInt(br.readLine());

            double d1 = Math.PI * r * r;
            double d2 = r * r * 2;

            bw.write(String.format("%.6f\n%.6f", d1, d2));
        } catch (IOException e) {}
    }
}
