package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P11653 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            List<Integer> a = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());

            Q(n, a);

            a.forEach(i -> {
                try {
                    bw.write(Integer.toString(i));
                    bw.newLine();
                } catch (Exception ignored) {}
            });
        } catch (IOException e) {}
    }

    public static void Q(int n, int d, List<Integer> l) {
        if (n == 1) return;
        if (Math.round(Math.sqrt(n)) < d) {
            l.add(n);
            return;
        }

        if (n % d == 0) {
            l.add(d);
            Q(n / d, 2, l);
        } else {
            Q(n, d + 1, l);
        }
    }

    public static void Q(int n, List<Integer> l) {
        Q(n, 2, l);
    }
}
