package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1008 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))
            ) {
            var tk = new StringTokenizer(br.readLine());
            
            double a = Double.parseDouble(tk.nextToken());
            double b = Double.parseDouble(tk.nextToken());
            
            bw.write(Double.toString(a / b));
        } catch (IOException e) {}
    }
}
