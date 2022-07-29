package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1764 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringBuilder sb = new StringBuilder();
            Set<String> ns = new HashSet<>();
            List<String> ms = new ArrayList<>();

            var tk = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(tk.nextToken());
            int m = Integer.parseInt(tk.nextToken());

            for (int i = n; i > 0; --i) ns.add(br.readLine());
            for (int i = m; i > 0; --i) {
                String str = br.readLine();
                if (ns.contains(str)) {
                    ms.add(str);
                }
            }
            
            sb.append(ms.size()).append('\n');

            Collections.sort(ms);
            ms.stream().forEach(o0 -> sb.append(o0).append('\n'));

            bw.write(sb.toString());
        } catch (IOException e) {}
    }
}
