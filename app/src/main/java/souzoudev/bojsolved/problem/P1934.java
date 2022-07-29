package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1934 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            var sb = new StringBuilder();

            while (n > 0) {
                var tk = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(tk.nextToken());
                int b = Integer.parseInt(tk.nextToken());

                sb.append(a * b / gcd(a, b)).append('\n');
                n--;
            }

            bw.write(sb.toString());
        } catch (IOException e) {}
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}
