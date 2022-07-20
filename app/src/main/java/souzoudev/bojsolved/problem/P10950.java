package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.StringTokenizer;

public class P10950 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
            var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            while (n != 0) {
                var tk = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(tk.nextToken());
                int b = Integer.parseInt(tk.nextToken());

                bw.write(Integer.toString(a + b)); bw.newLine();

                n--;
            }
        } catch (IOException e) {}
    }
}
