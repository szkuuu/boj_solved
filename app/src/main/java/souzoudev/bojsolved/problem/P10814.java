package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P10814 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            String[] users = new String[n];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; ++i) {
                sb.setLength(0);
                users[i] = sb.append(br.readLine()).append('$').append(i).toString();
            }

            sb.setLength(0);
            Arrays.stream(users).sorted((o1, o2) -> {
                var tk1 = new StringTokenizer(o1);
                var tk2 = new StringTokenizer(o2);

                int o1Age = Integer.parseInt(tk1.nextToken());
                int o2Age = Integer.parseInt(tk2.nextToken());

                if (o1Age != o2Age) return o1Age - o2Age;

                var tki1 = new StringTokenizer(tk1.nextToken(), "$");
                var tki2 = new StringTokenizer(tk2.nextToken(), "$");

                var trash1 = tki1.nextToken();
                var trash2 = tki2.nextToken();

                int o1Idx = Integer.parseInt(tki1.nextToken());
                int o2Idx = Integer.parseInt(tki2.nextToken());

                return o1Idx - o2Idx;
            }).map(o -> {
                StringBuilder innerSb = new StringBuilder();
                var tk = new StringTokenizer(o, "$");

                return innerSb.append(tk.nextToken()).toString();
            }).forEach(o -> sb.append(o).append('\n'));

            bw.write(sb.toString());
        } catch (IOException e) {}
    }
}
