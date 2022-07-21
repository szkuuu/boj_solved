package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1152 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());
            bw.write(Integer.toString(tk.countTokens()));
        } catch (IOException e) {}
    }
}
