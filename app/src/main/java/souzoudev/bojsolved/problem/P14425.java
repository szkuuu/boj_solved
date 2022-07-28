package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P14425 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());
            Map<String, Integer> dict = new HashMap<>();
            int ret = 0;

            int n = Integer.parseInt(tk.nextToken());
            int m = Integer.parseInt(tk.nextToken());

            for (int i = n; i > 0; --i) {
                dict.put(br.readLine(), 1);
            }

            for (int i = m; i > 0; --i) {
                ret += dict.getOrDefault(br.readLine(), 0);
            }

            bw.write(Integer.toString(ret));
        } catch (IOException e) {}
    }
}
