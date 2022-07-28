package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P1181 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            String[] ss = new String[n];
            StringBuilder sb = new StringBuilder();

            for (int i = n; i > 0; --i) {
                ss[i - 1] = br.readLine();
            }

            Arrays.stream(ss).sorted((o1, o2) -> {
                if (o1.length() != o2.length()) return o1.length() - o2.length();

                int len = o1.length();
                for (int idx = 0; idx < len; ++idx) {
                    if (o1.charAt(idx) != o2.charAt(idx)) return o1.charAt(idx) - o2.charAt(idx);
                }

                return 0;
            }).distinct().forEach(s -> sb.append(s).append('\n'));
            
            bw.write(sb.toString());
        } catch (IOException e) {}
    }
}
