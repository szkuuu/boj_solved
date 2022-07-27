package souzoudev.bojsolved.problem;

import java.io.*;
import java.util.*;

public class P2750 {
    public static void solution(String[] args) {
        try (var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];

            for (int i = 0; i < a.length; ++i) {
                a[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(a);

            for (var item : a) {
                bw.write(Integer.toString(item));
                bw.newLine();
            }
        } catch (IOException e) {}
    }
}
