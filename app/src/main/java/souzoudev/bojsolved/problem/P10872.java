package souzoudev.bojsolved.problem;

import java.io.*;

public class P10872 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            bw.write(Integer.toString(Q(n)));
        } catch (IOException e) {}
    }

    public static int Q(int n, int ret) {
        if (n == 0) return 1;
        
        return n == 1 ? ret : Q(n - 1, ret * n);
    }

    public static int Q(int n) {
        return Q(n, 1);
    }
}
