package souzoudev.bojsolved.problem;

import java.io.*;

public class P11654 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            char c = br.readLine().charAt(0);
            int i = (int) c;

            bw.write(Integer.toString(i));
        } catch (IOException e) {}
    }
}
