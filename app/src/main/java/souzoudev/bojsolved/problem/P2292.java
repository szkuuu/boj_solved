package souzoudev.bojsolved.problem;

import java.io.*;

public class P2292 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            bw.write(Integer.toString(Q(n)));
        } catch (IOException e) {}
    }

    public static int Q(int n, int start, int inc, int ret) {
        if (n == 1) return 1;
        
        int end = start + inc;
        return (((6 * start) + 2) <= n) && (((6 * end) + 1) >= n) ?
            ret :
            Q(n, end, inc + 1, ret + 1);
    }

    public static int Q(int n) {
        return Q(n, 0, 1, 2);
    }
}
