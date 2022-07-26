package souzoudev.bojsolved.problem;

import java.io.*;

public class P2231 {
    private static int RET = 0;

    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int start = n - 54 < 0 ? 0 : n - 54;

            for (int i = start; i < n; ++i) {
                int temp = i;
                int Q = i;

                while (temp != 0) {
                    Q += temp % 10;
                    temp /= 10;
                }

                if (Q == n) {
                    RET = i;
                    break;
                }
            }

            bw.write(Integer.toString(RET));
        } catch (IOException e) {}
    }
}
