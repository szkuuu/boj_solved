package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P10951 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var tk = new StringTokenizer(br.readLine());

            do {
                int a = Integer.parseInt(tk.nextToken());
                int b = Integer.parseInt(tk.nextToken());

                bw.write(Integer.toString(a + b)); bw.newLine();

                tk = new StringTokenizer(br.readLine());
            } while (tk.hasMoreTokens());
        } catch (IOException e) {

        } catch (NullPointerException e) {
            
        }
    }
}
