package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P2609 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(tk.nextToken());
            int b = Integer.parseInt(tk.nextToken());

            int c = a < b ? a : b;

            int ret0 = 1;
            int ret1 = 1;

            int i = 2;

            while (i <= c) {
                if (a == 1 || b == 1) break;
                
                if (a % i == 0 && b % i == 0) {
                    ret0 *= i;
                    ret1 *= i;

                    a /= i;
                    b /= i;

                    c = a < b ? a : b;

                    i = 2;
                    continue;
                }
                ++i;
            }

            ret1 *= (a * b);

            bw.write(Integer.toString(ret0));
            bw.newLine();
            bw.write(Integer.toString(ret1));
        } catch (IOException e) {}
    }
}
