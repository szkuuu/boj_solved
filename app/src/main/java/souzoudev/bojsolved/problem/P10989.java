package souzoudev.bojsolved.problem;

import java.io.*;

public class P10989 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[10001];
            int max = Integer.MIN_VALUE;
            StringBuilder sb = new StringBuilder();

            while (n > 0) {
                int idx = Integer.parseInt(br.readLine());
                ++a[idx];
                max = max < idx ? idx : max;
                n--;
            }

            for (int i = 0; i <= max; ++i) {
                for (int j = a[i]; j > 0; --j) sb.append(i).append('\n');
            }

            bw.write(sb.toString());
        } catch (IOException e) {}
    }
}
