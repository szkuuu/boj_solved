package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P3009 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[] xp = new int[1001];
            int[] yp = new int[1001];
            StringBuilder sb = new StringBuilder();

            for (int i = 3; i > 0; --i) {
                var tk = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(tk.nextToken());
                int y = Integer.parseInt(tk.nextToken());

                xp[x]++;
                yp[y]++;
            }

            for (int i = 0; i < 1001; ++i) {
                if (xp[i] == 1) {
                    sb.append(i).append(' ');
                    break;
                }
            }

            for (int i = 0; i < 1001; ++i) {
                if (yp[i] == 1) {
                    sb.append(i);
                    break;
                }
            }

            bw.write(sb.toString());
        } catch (IOException e) {}
    }
}
