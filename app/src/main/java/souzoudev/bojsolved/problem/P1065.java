package souzoudev.bojsolved.problem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.*;
import java.util.stream.*;

public class P1065 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            bw.write(Long.toString(IntStream.rangeClosed(1, n).boxed().map(P1065::isQ).filter(b -> b).count()));
            bw.newLine();
        } catch (IOException e) {}
    }

    public static boolean isQ(int start, int next, int diff) {
        int q = start / 10;
        int r = start % 10;

        if (q == 0) return true;

        int d = q < 10 ? q - r : (q % 10) - r;
        
        if (diff == -10) diff = d;

        return d == diff ? isQ(q, r, diff) : false;
    }

    public static boolean isQ(int start) {
        return isQ(start, 0, -10);
    }
}
