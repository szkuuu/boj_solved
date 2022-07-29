package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P4153 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                var tk = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(tk.nextToken());
                if (a == 0) break;
                a *= a;
                int b = Integer.parseInt(tk.nextToken());
                b *= b;
                int c = Integer.parseInt(tk.nextToken());
                c *= c;

                int max = Math.max(Math.max(a, b), c);
                int sum = max == a ? b + c : max == b ? a + c : a + b;

                bw.write(max == sum ? "right" : "wrong");
                bw.newLine();
            }
        } catch (IOException e) {}
    }
}
