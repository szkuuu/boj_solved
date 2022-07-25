package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1929 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tk.nextToken());
            int b = Integer.parseInt(tk.nextToken());
            
            int i = a;

            while (i <= b) {
                if (isQ(i)) {
                    bw.write(Integer.toString(i));
                    bw.newLine();
                }
                ++i;
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
