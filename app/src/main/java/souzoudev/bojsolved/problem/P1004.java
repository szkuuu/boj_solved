package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1004 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int t = Integer.parseInt(br.readLine());
            var sb = new StringBuilder();

            while (t > 0) {
                var tk = new StringTokenizer(br.readLine());

                int startX = Integer.parseInt(tk.nextToken());
                int startY = Integer.parseInt(tk.nextToken());
                int endX = Integer.parseInt(tk.nextToken());
                int endY = Integer.parseInt(tk.nextToken());

                int n = Integer.parseInt(br.readLine());
                int ret = 0;
                while (n > 0) {
                    var tks = new StringTokenizer(br.readLine());

                    int x = Integer.parseInt(tks.nextToken());
                    int y = Integer.parseInt(tks.nextToken());
                    int r = Integer.parseInt(tks.nextToken());

                    double sd = Math.sqrt(Math.pow(startX - x, 2) + Math.pow(startY - y, 2));
                    double ed = Math.sqrt(Math.pow(endX - x, 2) + Math.pow(endY - y, 2));

                    if (sd < r && ed < r) {
                        n--;
                        continue;
                    } else if (sd < r || ed < r) {
                        ++ret;
                        n--;
                        continue;
                    } else {
                        n--;
                        continue;
                    }
                }
                sb.append(ret).append('\n');
                t--;
            }

            bw.write(sb.toString());
        } catch (IOException e) {}
    }
}
