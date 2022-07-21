package souzoudev.bojsolved.problem;

import java.io.*;

public class P5622 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String s = br.readLine();

            bw.write(Integer.toString(s.chars().map(P5622::sec).sum()));
        } catch (IOException e) {}
    }

    public static int sec(int ch) {
        if (ch >= 'A' && ch <= 'C') return 3;
        if (ch >= 'D' && ch <= 'F') return 4;
        if (ch >= 'G' && ch <= 'I') return 5;
        if (ch >= 'J' && ch <= 'L') return 6;
        if (ch >= 'M' && ch <= 'O') return 7;
        if (ch >= 'P' && ch <= 'S') return 8;
        if (ch >= 'T' && ch <= 'V') return 9;
        if (ch >= 'W' && ch <= 'Z') return 10;
        
        return -1;
    }
}
