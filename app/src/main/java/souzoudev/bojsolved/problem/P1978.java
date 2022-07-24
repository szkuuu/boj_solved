package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1978 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            var tk = new StringTokenizer(br.readLine());

            int ret = 0;
            while (tk.hasMoreTokens()) {
                int a = Integer.parseInt(tk.nextToken());

                if (isQ(a)) ++ret;
            }

            bw.write(Integer.toString(ret));
        } catch (IOException e) {}
    }

    public static boolean isQ(int n, int d) {
        if (n == 1) return false;
        if ((int) Math.round(Math.sqrt(n)) < d) return true;

        return n % d == 0 ? false : isQ(n, d + 1);
    }

    public static boolean isQ(int n) {
        return isQ(n, 2);
    }
}
