package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1330 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            var tk = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(tk.nextToken());
            int b = Integer.parseInt(tk.nextToken());
            
            bw.write(a == b ? "==" : a > b ? ">" : "<");
        } catch (IOException e) {}
    }
}
