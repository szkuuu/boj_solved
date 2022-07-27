package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1018 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(tk.nextToken());
            int w = Integer.parseInt(tk.nextToken());

            char[][] chess = new char[h][w];

            for (int i = 0; i < h; ++i) {
                String blockRow = br.readLine();
                for (int j = 0; j < blockRow.length(); ++j) {
                    chess[i][j] = blockRow.charAt(j);
                }
            }

            char start = '\0';
            char cmp = '\0';
            int ret = 64;

            outer: for (int xs = 0, xe = 8; xe <= w; ++xs, ++xe) {
                for (int ys = 0, ye = 8; ye <= h; ++ys, ++ye) {
                    for (int q = 0; q < 2; ++q) {
                        int count = 0;
                        start = q % 2 == 0 ? 'B' : 'W';

                        for (int y = ys; y < ye; ++y) {
                            for (int x = xs; x < xe; ++x) {
                                if (x == xs) {
                                    start = y == ys ? start : start == 'B' ? 'W' : 'B';
                                    cmp = start;
                                }
    
                                if (cmp != chess[y][x]) count++;
                                cmp = cmp == 'B' ? 'W' : 'B';
                            }
                        }

                        ret = ret > count ? count : ret;
                    }

                    if (ret == 0) break outer;
                }
            }

            bw.write(Integer.toString(ret));
        } catch (IOException e) {}
    }
}
