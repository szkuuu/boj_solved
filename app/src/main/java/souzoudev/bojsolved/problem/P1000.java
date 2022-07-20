package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1000 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
             var bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            var token = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            
            bw.write(Integer.toString(a + b));
        } catch (IOException e) {}
    }
}
