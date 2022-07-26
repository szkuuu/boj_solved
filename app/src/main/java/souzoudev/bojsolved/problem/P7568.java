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

            while (temp > 0) {
                var tk = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(tk.nextToken());
                int y = Integer.parseInt(tk.nextToken());

                list[n - temp][0] = x;
                list[n - temp][1] = y;

                temp--;
            }
            
            StringBuilder sb = new StringBuilder();
            
            for (int i1 = 0; i1 < n; ++i1) {
                int rankRet = 1;
                for (int i2 = 0; i2 < n; ++i2) {
                    if (i1 == i2) continue;
                    
                    if (list[i1][0] < list[i2][0] && list[i1][1] < list[i2][1]) {
                        rankRet++;
                    }
                }
                
                sb.append(rankRet).append(' ');
            }
            
            bw.write(sb.toString().trim());
        } catch (IOException e) {}
    }
}
