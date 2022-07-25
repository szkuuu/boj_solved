package souzoudev.bojsolved.problem;

import java.io.*;

public class P10870 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            bw.write(Integer.toString(Q(n)));
        } catch (IOException e) {}
    }

    public static int Q(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;

        return Q(n - 1) + Q(n - 2);
    }
}
