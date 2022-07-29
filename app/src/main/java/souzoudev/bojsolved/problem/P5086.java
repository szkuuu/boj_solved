package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P5086 {
    private static StringBuilder Sb = new StringBuilder();

    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                var tk = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(tk.nextToken());
                if (a == 0) break;

                int b = Integer.parseInt(tk.nextToken());

                if (a / b == 0 && b % a == 0) {
                    Sb.append("factor").append('\n');
                } else if (a % b == 0) {
                    Sb.append("multiple").append('\n');
                } else {
                    Sb.append("neither").append('\n');
                }
            }

            bw.write(Sb.toString());
        } catch (IOException e) {}
    }
}
