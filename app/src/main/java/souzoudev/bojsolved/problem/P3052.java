package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P3052 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = 10;
            var list = new ArrayList<Integer>();

            while (n != 0) {
                list.add(Integer.parseInt(br.readLine()));
                n--;
            }

            bw.write(Long.toString(list.stream().map(i -> i % 42).distinct().count()));
            bw.newLine();
        } catch (IOException e) {}
    }
}
