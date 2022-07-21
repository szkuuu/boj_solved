package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1712 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(tk.nextToken());
            int b = Integer.parseInt(tk.nextToken());
            int c = Integer.parseInt(tk.nextToken());
            int Q = c - b <= 0 ? -1 : (int) (a / (double) (c - b)) + 1;

            bw.write(Integer.toString(Q));
        } catch (IOException e) {}
    }
}
