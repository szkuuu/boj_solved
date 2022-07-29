package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1037 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            var tk = new StringTokenizer(br.readLine());

            for (int i = n; i > 0; --i) a[i - 1] = Integer.parseInt(tk.nextToken());

            Arrays.sort(a);

            bw.write(Integer.toString(a[0] * a[n - 1]));
        } catch (IOException e) {}
    }
}
