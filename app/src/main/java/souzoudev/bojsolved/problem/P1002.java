package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1002 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            for (int i = n; i > 0; --i) {
                var tk = new StringTokenizer(br.readLine());

                int x1 = Integer.parseInt(tk.nextToken());
                int y1 = Integer.parseInt(tk.nextToken());
                int r1 = Integer.parseInt(tk.nextToken());
                int x2 = Integer.parseInt(tk.nextToken());
                int y2 = Integer.parseInt(tk.nextToken());
                int r2 = Integer.parseInt(tk.nextToken());

                double d = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));

                int ret = Integer.MIN_VALUE;

                if (d == 0) {
                    ret = r1 - r2 == 0 ? -1 : 0;
                } else if (d == Math.abs(r1 - r2)) {
                    ret = 1;
                } else if (d < Math.abs(r1 - r2)) {
                    ret = 0;
                } else if (d > r1 + r2) {
                    ret = 0;
                } else if (d < r1 + r2) {
                    ret = 2;
                } else if (d == r1 + r2) {
                    ret = 1;
                }

                bw.write(Integer.toString(ret));
                bw.newLine();
            }
        } catch (IOException e) {}
    }
}
