package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P2525 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            var tk = new StringTokenizer(br.readLine());
            
            int h = Integer.parseInt(tk.nextToken());
            int m = Integer.parseInt(tk.nextToken());
            int a = Integer.parseInt(br.readLine());
            
            m += a;
            h += (m / 60);
            m %= 60;
            h %= 24;
            
            bw.write(Integer.toString(h) + " " + Integer.toString(m));
        } catch (IOException e) {}
    }
}
