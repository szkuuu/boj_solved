package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P2869 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());

            long a = Long.parseLong(tk.nextToken());
            long b = Long.parseLong(tk.nextToken());
            long v = Long.parseLong(tk.nextToken());

            long p = v - b;
            long q = a - b;

            long ret = (long) (Math.ceil(p / (double) q));

            bw.write(Long.toString(ret));
        } catch (IOException e) {}
    }
}
