package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P10250 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int t = Integer.parseInt(br.readLine());

            while (t != 0) {
                var tk = new StringTokenizer(br.readLine());

                int h = Integer.parseInt(tk.nextToken());
                int w = Integer.parseInt(tk.nextToken());
                int n = Integer.parseInt(tk.nextToken());

                int ret = (((n - 1) % h) + 1) * 100 + (int) (Math.ceil(n / (double) h));

                bw.write(Integer.toString(ret));
                bw.newLine();

                t--;
            }
        } catch (IOException e) {}
    }
}
