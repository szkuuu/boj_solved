package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P2884 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            var tk = new StringTokenizer(br.readLine());
            
            int h = Integer.parseInt(tk.nextToken());
            int m = Integer.parseInt(tk.nextToken());
            
            m -= 45;
            h = m >= 0 ? h : h == 0 ? 23 : h - 1;
            m = m >= 0 ? m : m + 60;
            
            bw.write(Integer.toString(h) + " " + Integer.toString(m));
        } catch (IOException e) {}
    }
}
