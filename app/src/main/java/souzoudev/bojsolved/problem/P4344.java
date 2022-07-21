package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P4344 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            while (n != 0) {
                var tk = new StringTokenizer(br.readLine());
                
                int a = Integer.parseInt(tk.nextToken());
                int[] scores = new int[a];

                int idx = 0;
                while (tk.hasMoreTokens()) {
                    scores[idx] = Integer.parseInt(tk.nextToken());
                    idx++;
                }

                double avg = Arrays.stream(scores).average().orElseThrow();
                int Q = (int) Arrays.stream(scores).boxed().filter(i -> i > avg).count();

                bw.write(String.format("%.3f", Q / (double) a * 100) + "%"); bw.newLine();
                n--;
            }
        } catch (IOException e) {}
    }
}
