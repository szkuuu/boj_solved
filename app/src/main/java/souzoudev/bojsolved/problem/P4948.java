package souzoudev.bojsolved.problem;

import java.io.*;

public class P4948 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = 0;

            while ((n = Integer.parseInt(br.readLine())) != 0) {
                int i2 = n * 2;
                int t = n + 1;
                int ret = 0;

                while (t <= i2) {
                    if (isQ(t)) ret++;

                    t++;
                }

                bw.write(Integer.toString(ret));
                bw.newLine();
            }
        } catch (IOException e) {}
    }

    public static boolean isQ(int n, int d) {
        if (n == 1) return false;
        if (Math.floor(Math.sqrt(n)) < d) return true;

        return n % d == 0 ? false : isQ(n, d + 1);
    }

    public static boolean isQ(int n) {
        return isQ(n, 2);
    }
}
