package souzoudev.bojsolved.problem;

import java.io.*;

public class P2839 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            bw.write(Integer.toString(Q(n)));
        } catch (IOException e) {}
    }

    public static int Q(int n) {
        if (n <= 5) return (n == 3 || n == 5) ? 1 : -1;
        if (n == 7) return -1;

        int q = n / 5;
        int r = n % 5;

        switch (r) {
            case 0: return q;
            case 1: return q + 1;
            case 2: return q + 2;
            case 3: return q + 1;
            case 4: return q + 2;

            default: return -1;
        }
    }
}
