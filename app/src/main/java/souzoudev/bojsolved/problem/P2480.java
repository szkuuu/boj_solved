package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P2480 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            var tk = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(tk.nextToken());
            int b = Integer.parseInt(tk.nextToken());
            int c = Integer.parseInt(tk.nextToken());
            int ret;
            
            if (a == b && b == c && a == c) {
                ret = 10000 + (1000 * a);
            } else if (a == b || a == c) {
                ret = 1000 + (100 * a);
            } else if (b == c) {
                ret = 1000 + (100 * b);
            } else {
                ret = Math.max(Math.max(a, b), c) * 100;
            }
            
            bw.write(Integer.toString(ret));
        } catch (IOException e) {}
    }
}
