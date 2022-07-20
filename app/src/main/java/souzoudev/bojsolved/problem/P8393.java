package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.stream.*;

public class P8393 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int a = Integer.parseInt(br.readLine());

            int ret = IntStream.rangeClosed(1, a).sum();

            bw.write(Integer.toString(ret));
            bw.newLine();
        } catch (IOException e) {}
    }
}
