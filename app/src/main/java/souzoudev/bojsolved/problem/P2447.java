package souzoudev.bojsolved.problem;

import java.io.*;

public class P2447 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            
            bw.write(Q(n));
        } catch (IOException e) {}
    }
    
    public static String Q(int n, int cmp, String cell) {
        var cellSplit = cell.split("\n");
        String blankRow = " ".repeat(cmp / 3);

        var nextCell = new StringBuilder();

        for (int i = 0; i < 3; ++i) {
            for (var str : cellSplit) {
                nextCell.append(str).append(i == 1 ? blankRow : str).append(str);
                nextCell.append('\n');
            }
        }

        if (n == cmp) return nextCell.toString();

        return Q(n, cmp * 3, nextCell.toString());
    }

    public static String Q(int n) {
        return Q(n, 3, "*");
    }
}
