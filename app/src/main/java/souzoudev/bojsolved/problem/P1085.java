package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1085 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(tk.nextToken());
            int y = Integer.parseInt(tk.nextToken());
            int w = Integer.parseInt(tk.nextToken());
            int h = Integer.parseInt(tk.nextToken());

            int xMin = x - 0 <= w - x ? x - 0 : w - x;
            int yMin = y - 0 <= h - y ? y - 0 : h - y;
            int min = xMin <= yMin ? xMin : yMin;

            bw.write(Integer.toString(min));
        } catch (IOException e) {}
    }
}
