package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.StringTokenizer;

public class P11022 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int caseNumber = 0;
            var sb = new StringBuilder();

            while (n != 0) {
                var tk = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(tk.nextToken());
                int b = Integer.parseInt(tk.nextToken());

                sb.setLength(0);
                bw.write(
                    sb.append("Case #")
                        .append(++caseNumber)
                        .append(": ")
                        .append(a)
                        .append(" + ")
                        .append(b)
                        .append(" = ")
                        .append(a + b)
                        .toString()
                );
                bw.newLine();

                n--;
            }
        } catch (IOException e) {}
    }
}
