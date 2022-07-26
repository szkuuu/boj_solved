package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P7568 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int temp = n;
            int[][] list = new int[n][2];
            int[] rank = new int[n];
            int[] ret = new int[n];

            Arrays.fill(rank, 0);
            Arrays.fill(ret, 0);

            while (temp > 0) {
                var tk = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(tk.nextToken());
                int y = Integer.parseInt(tk.nextToken());

                list[n - temp][0] = x;
                list[n - temp][1] = y;

                temp--;
            }

            for (int idx = 0; idx < n; ++idx) {
                for (int cidx = idx + 1; cidx < n; ++cidx) {
                    if (list[idx][0] > list[cidx][0] && list[idx][1] > list[cidx][1]) {
                        rank[idx] += 1;
                        rank[cidx] -= 1;
                    }

                    if (list[idx][0] < list[cidx][0] && list[idx][1] < list[cidx][1]) {
                        rank[cidx] += 1;
                        rank[idx] -= 1;
                    }
                }
            }

            for (int idx = 0; idx < n; ++idx) {
                int rankRet = 1;
                for (int ridx = 0; ridx < n; ++ridx) {
                    if (idx == ridx) continue;
                    if (rank[idx] < rank[ridx]) ++rankRet;
                }
                ret[idx] = rankRet;
            }

            StringBuilder sb = new StringBuilder();

            for (var i : ret) sb.append(i).append(' ');
            
            bw.write(sb.toString().trim());
        } catch (IOException e) {}
    }
}
