package souzoudev.bojsolved.problem;

import java.io.*;

public class P1193 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int[] q = Q(n);
            int v = q[0];
            int diff = q[1];

            int a = (v % 2 == 0) ? v - diff : 1 + diff;
            int b = v + 1 - a;

            bw.write(Integer.toString(a) + "/" + Integer.toString(b));
        } catch (IOException e) {}
    }

    public static int[] Q(int n, int start, int inc, int ret) {
        if (n == 1) return new int[] { 1, 0 };

        int end = start + inc;

        return start <= n && end >= n ? new int[] { ret, Math.abs(end - n) } : Q(n, end, inc + 1, ret + 1);
    }

    public static int[] Q(int n) {
        return Q(n, 1, 2, 2);
    }
}
