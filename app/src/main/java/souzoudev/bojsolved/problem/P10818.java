package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P10818 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int _n = Integer.parseInt(br.readLine());
            var arr = new ArrayList<Integer>();
            var tk = new StringTokenizer(br.readLine());

            while (tk.hasMoreTokens()) {
                arr.add(Integer.parseInt(tk.nextToken()));
            }

            bw.write(
                String.format(
                    "%d %d",
                    arr.stream().min(Comparator.naturalOrder()).get(),
                    arr.stream().max(Comparator.naturalOrder()).get())
            );
        } catch (IOException e) {}
    }
}
