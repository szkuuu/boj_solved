package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1546 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int[] scores = new int[n];

            int i = 0;
            var tk = new StringTokenizer(br.readLine());

            while (tk.hasMoreTokens()) {
                scores[i] = Integer.parseInt(tk.nextToken());
                i++;
            }

            int max = Arrays.stream(scores).max().orElseThrow();
            int sum = Arrays.stream(scores).sum();
            double Q = 100.0 / (double) max;

            double ret = (Q * sum) / (double) n;
            bw.write(Double.toString(ret));
            bw.newLine();
        } catch (IOException e) {}
    }
}
