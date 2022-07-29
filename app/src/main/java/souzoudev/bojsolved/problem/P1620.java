package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class P1620 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Map<Integer, String> dict = new HashMap<>();
            StringBuilder sb = new StringBuilder();

            var tk = new StringTokenizer(br.readLine());

            int cLength = Integer.parseInt(tk.nextToken());
            int pLength = Integer.parseInt(tk.nextToken());

            for (int i = 0; i < cLength; ++i) {
                dict.put(i + 1, br.readLine());
            }

            var reversed = 
                dict.entrySet()
                    .stream()
                    .collect(Collectors.toMap(d -> d.getValue(), d -> d.getKey()));

            for (int i = 0; i < pLength; ++i) {
                String str = br.readLine();
                if (Character.isDigit(str.charAt(0))) {
                    sb.append(dict.get(Integer.parseInt(str))).append('\n');
                } else {
                    sb.append(reversed.get(str)).append('\n');
                }
            }

            bw.write(sb.toString());
        } catch (IOException e) {}
    }
}
