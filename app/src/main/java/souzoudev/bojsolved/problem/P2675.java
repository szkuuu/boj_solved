package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P2675 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            var sb = new StringBuilder();

            while (n != 0) {
                var tk = new StringTokenizer(br.readLine());
                int repeat = Integer.parseInt(tk.nextToken());
                String str = tk.nextToken();

                sb.setLength(0);
                str.chars().boxed().forEach(o -> {
                    sb.append(new String(new char[repeat]).replace('\0', (char) o.intValue()));
                });

                bw.write(sb.toString());
                bw.newLine();
                n--;
            }
        } catch (IOException e) {}
    }
}
