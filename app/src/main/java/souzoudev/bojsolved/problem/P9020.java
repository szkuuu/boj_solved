package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.Arrays;

public class P9020 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            final int MAX = 10000;
            boolean[] a = new boolean[MAX + 1];
            Arrays.fill(a, true);
            
            a[0] = false;
            a[1] = false;

            for (int i1 = 2; i1 * i1 < MAX; ++i1) {
                if (!a[i1]) continue;

                for (int i2 = i1 * i1; i2 < MAX; i2 += i1) a[i2] = false;
            }

            int n = Integer.parseInt(br.readLine());

            while (n > 0) {
                int t = Integer.parseInt(br.readLine());
                int i = t / 2;

                while (i >= 2) {
                    if (a[i] && a[t - i]) {
                        bw.write(Integer.toString(i) + " " + Integer.toString(t - i));
                        bw.newLine();
                        break;
                    }

                    i--;
                }
                n--;
            }
        } catch (IOException e) {}
    }
}
