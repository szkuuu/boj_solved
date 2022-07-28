package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P18870 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            Map<Integer, Integer> rank = new TreeMap<>();
            StringBuilder sb = new StringBuilder();

            var tk = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; ++i) a[i] = Integer.parseInt(tk.nextToken());

            int r = 0;
            for (var elem : Arrays.stream(a).distinct().sorted().toArray()) {
                rank.put(elem, r);
                r++;
            }

            for (var elem : a)sb.append(rank.get(elem)).append(' ');

            bw.write(sb.toString().trim());
        } catch (IOException e) {}
    }
}
