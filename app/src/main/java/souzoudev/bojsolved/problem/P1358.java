package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1358 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(tk.nextToken());
            int h = Integer.parseInt(tk.nextToken());
            int x = Integer.parseInt(tk.nextToken());
            int y = Integer.parseInt(tk.nextToken());
            int p = Integer.parseInt(tk.nextToken());
            int r = h / 2;

            int ret = 0;

            while (p > 0) {
                var tkp = new StringTokenizer(br.readLine());

                int px = Integer.parseInt(tkp.nextToken());
                int py = Integer.parseInt(tkp.nextToken());

                if (x <= px && px <= x + w && y <= py && py <= y + h) {
                    ret++;
                    p--;
                    continue;
                }

                double ld = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - (y + r), 2));
                double rd = Math.sqrt(Math.pow(px - (x + w), 2) + Math.pow(py - (y + r), 2));

                if (ld <= r || rd <= r) {
                    ret++;
                    p--;
                    continue;
                }

                p--;
            }

            bw.write(Integer.toString(ret));
        } catch (IOException e) {}
    }
}
