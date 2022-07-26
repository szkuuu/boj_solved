package souzoudev.bojsolved.problem;

import java.io.*;

public class P11729 {
    private static StringBuilder SB = new StringBuilder();

    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int attempt = (int) Math.pow(2, n) - 1;

            bw.write(Integer.toString(attempt));
            bw.newLine(); 

            Q(n);
            bw.write(SB.toString());
        } catch (IOException e) {}
    }

    public static void Q(int n, int from, int bridge, int to) {
        if (n == 1) {
            SB.append(from).append(' ').append(to).append('\n');
            return;
        }

        // if (n == 2) {
        //     bw.write(String.format("%d %d\n", from, bridge));
        //     bw.write(String.format("%d %d\n", from, to));
        //     bw.write(String.format("%d %d\n", bridge, to));
            
        //     return;
        // }

        Q(n - 1, from, to, bridge);
        SB.append(from).append(' ').append(to).append('\n');
        Q(n - 1, bridge, from, to);
    }

    public static void Q(int n) {
        Q(n, 1, 2, 3);
    }
}
